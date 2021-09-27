import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example2630 {

	static int[][] board;
	static int white = 0;
	static int blue = 0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		board = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		findBoardColor(0, 0, N);
		
		System.out.println(white);
		System.out.println(blue);
	}
	
	public static void findBoardColor(int row, int col, int size) {
		
		if(colorCheck(row, col, size)) {
			if(board[row][col] == 0)
				white++;
			else
				blue++;
			return;
		}
		
		int halfSize = size / 2;
		
		findBoardColor(row, col, halfSize);
		findBoardColor(row, col + halfSize, halfSize);
		findBoardColor(row + halfSize , col, halfSize);
		findBoardColor(row + halfSize , col + halfSize, halfSize);
	}
	
	public static boolean colorCheck(int row, int col, int size) {
		
		int firstColor = board[row][col];
		
		for (int i = row; i < row + size; i++) {
			
			for (int j = col; j < col + size; j++) {
				
				if(firstColor != board[i][j])
					return false;
			}
		}
		return true;
	}

}
