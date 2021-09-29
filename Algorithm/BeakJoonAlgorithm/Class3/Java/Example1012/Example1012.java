import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example1012 {

	static int M;
	static int N;
	static int[][] arr;
	static int[] dx = {-1, 0, 1, 0}; // ÁÂ»ó¿ìÇÏ
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			arr = new int[N][M];
			
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				
				arr[Y][X] = 1;
			}
			
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(arr[i][j] == 1) {
						cnt++;
						dfs(i ,j);
					}
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.print(sb.toString());
	}
	
	public static void dfs(int Y, int X) {
		
		for (int i = 0; i < 4; i++) { // ÁÂ »ó ¿ì ÇÏ ÀüºÎ Ã¼Å©ÇØ¾ßµÊ
			int nextX = X + dx[i];
			int nextY = Y + dy[i];
			
			if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N)
				continue;
			
			if(arr[nextY][nextX] == 0)
				continue;
			
			arr[nextY][nextX] = 0;
			dfs(nextY, nextX);
		}
	}

}
