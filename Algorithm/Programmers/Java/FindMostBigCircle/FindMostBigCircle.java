import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class FindMostBigCircle {
	public static int[][] arr; 
	public static StringBuilder sb;
	public static int maxLength = 0;
	public static int max = 0;
	public static int cnt = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().replace("[", "");
		
		String[] str = s.split("]");
		
		arr = new int[str.length + 1][str.length + 1];
		maxLength = str.length;
		for (int i = 0; i < str.length; i++) {
			String[] st;
			if(i!=0) {
				st = str[i].substring(1, str[i].length()).split(",");
			}
			else {
				st = str[i].split(",");
			}
			
			for (int j = 0; j < str.length; j++) {
				arr[i][j] = Integer.parseInt(st[j]);
			}
		}
		
		max = solution(arr);
		
		System.out.print(max);
	}
	
	public static int solution(int[][] board) {
		
		int max = 1;
		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[i].length; j++) {
				if(board[i][j] == 1) {
					int min = Integer.MAX_VALUE;
					min = Math.min(board[i - 1][j - 1], board[i - 1][j]);
					min = Math.min(min, board[i][j - 1]);
					board[i][j] = 1 + min;
					max = Math.max(board[i][j], max);
				}
			}
		}
		
		return max * max;
	}
}
