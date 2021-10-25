import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Example9019 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		while(T-- > 0) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			String[] cmd = new String[10000];
			boolean[] visited = new boolean[10000];
			Queue<Integer> queue = new LinkedList<Integer>();
			
			queue.offer(a);
			visited[a] = true;
			Arrays.fill(cmd, "");
			
			
			
			while((!queue.isEmpty()) && !visited[b]) {
				
				int now = queue.poll();
				
				int D = (now * 2) % 10000;
				int S = (now == 0) ? 9999 : now - 1;
				int L = (now % 1000) * 10 + (now / 1000);
				int R = (now / 10) + (now % 10) * 1000;
				
				if(!visited[D]) {
					queue.offer(D);
					visited[D] = true;
					cmd[D] = cmd[now] + "D";
				}
				
				if(!visited[S]) {
					queue.offer(S);
					visited[S] = true;
					cmd[S] = cmd[now] + "S";
				}
				
				if(!visited[L]) {
					queue.offer(L);
					visited[L] = true;
					cmd[L] = cmd[now] + "L";
				}
				
				if(!visited[R]) {
					queue.offer(R);
					visited[R] = true;
					cmd[R] = cmd[now] + "R";
				}
				
			}
			sb.append(cmd[b]).append("\n");
		}
		
		System.out.print(sb);
	}

}
