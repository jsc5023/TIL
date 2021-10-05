import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Example1780 {
	
	static int minusOne = 0;
	static int zero = 0;
	static int plusOne = 0;
	static int[][] paper;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		paper = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		findColorPaper(0, 0, N);
		
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(plusOne);
	}
	
	public static void findColorPaper(int row, int col, int size) {
		if(checkPaper(row, col, size)) {
			if(paper[row][col] == 1)
				plusOne++;
			else if(paper[row][col] == 0)
				zero++;
			else
				minusOne++;
			return;
		}
		
		int divSize = size / 3;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 ; j++) {
				findColorPaper(row + (i * divSize), col + (j * divSize), divSize);
			}
		}
	}
	
	static boolean checkPaper(int row, int col, int size) {
		
		int firstColor = paper[row][col];
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if(firstColor != paper[i][j])
					return false;
			}
		}
		
		return true;
	}
}
