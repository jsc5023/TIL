import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Example1260_List {
	
	static ArrayList<Integer>[] list;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N + 1];
		
		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		visit = new boolean[N+1];
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(list[i]);
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
		
		for (int item : list[v]) {
			if(!visit[item]) {
				dfs(item);
			}
		}
	}
	
	public static void bfs(int v) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(v);
		visit[v] = true;
		
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			System.out.print(temp + " ");
			for (Integer item : list[temp]) {
				if(!visit[item]) {
					queue.offer(item);
					visit[item] = true;
				}
					
			}
		}
	}
}
