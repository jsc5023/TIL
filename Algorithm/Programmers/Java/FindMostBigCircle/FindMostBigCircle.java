import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class FindMostBigCircle {
	public static int[][] arr; 
	public static StringBuilder sb;
	public static int[] dy = {-1, 1, 0, 0}; // го, ©Л, аб
	public static int[] dx = {0, 0, 1, -1};
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
		
		sb = new StringBuilder();
		
		for (int i = 0; i < maxLength; i++) {
			for (int j = 0; j < maxLength; j++) {
				if(i - 1 < 0 || j - 1 < 0 || i + 1 > maxLength || j + 1 > maxLength) {
					continue;
				}
				else if(arr[i][j] == 1) {
					arr[i][j] = 1 + Math.max(arr[i + dy[0]][j + dx[0]], arr[i + dy[1]][j + dx[1]]);
					arr[i][j] = Math.max(arr[i][j], arr[i + dy[2]][j + dx[2]]);
					arr[i][j] = Math.max(arr[i][j], arr[i + dy[3]][j + dx[3]]);
					max = Math.max(arr[i][j], max);
				}
			}
		}
		
		System.out.print(max * max);
	}
}
