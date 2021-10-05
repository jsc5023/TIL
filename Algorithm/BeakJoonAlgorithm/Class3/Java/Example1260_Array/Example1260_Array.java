import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Example1260_Array {

	static int N, M, V;
	static int[][] arr;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			arr[v1][v2] = 1;
			arr[v2][v1] = 1;
		}
		
		Arrays.fill(visit, false);
		dfs(V);
		System.out.println();
		
		Arrays.fill(visit, false);
		bfs(V);
	}
	
	public static void dfs(int v) {
		
		visit[v] = true;
		
		System.out.print(v + " ");
		
		for (int i = 1; i <= N; i++) {
			if(arr[v][i] == 1 && visit[i] == false) {
				dfs(i);
			}
		}
		
	}
	
	public static void bfs(int v) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(v);
		visit[v] = true;

		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			System.out.print(temp + " ");
			for (int i = 1; i <= N; i++) {
				if(arr[temp][i] == 1 && visit[i] == false) {
					queue.offer(i);
					visit[i] = true;
				}
					
			}
		}
	}

}
