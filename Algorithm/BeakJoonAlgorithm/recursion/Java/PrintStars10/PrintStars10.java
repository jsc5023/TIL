import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStars10 {

	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new char[N][N];
		
		starChar(0, 0, N, false);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	public static void starChar(int x, int y, int N, boolean blank) {
		
		if(blank) {
			for (int i = x; i < x+N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(N == 1){
			arr[x][y] = '*';
			return;
		}
		
		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) {
					starChar(i, j, size, true);
				} else {
					starChar(i, j, size, false);
				}
			}
		}
	}

}
