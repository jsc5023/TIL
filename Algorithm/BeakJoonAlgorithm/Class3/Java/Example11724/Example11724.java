import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example11724 {
	
	static int N, M;
	static int[][] arr;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N+1];
		arr = new int[N+1][N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			arr[v1][v2] = arr[v2][v1] = 1;
		}
		
		Arrays.fill(visit, false);
		
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if(!visit[i]) {
				dfs(i);
				cnt++;
			}	
		}
		
		System.out.print(cnt);
	}
	
	public static void dfs(int v) {
		if(visit[v])
			return;
		else {
			
			visit[v] = true;
			
			for (int i = 1; i <= N; i++) {
				if(arr[v][i] == 1)
					dfs(i);
			}
		}
	}
}