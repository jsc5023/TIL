import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Example11866 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		
		StringBuffer sb = new StringBuffer();
	
		sb.append("<");
		while(queue.size() > 0) {
			
			for (int i = 1; i < K; i++) {
				int val = queue.poll();
				queue.add(val);
			}
			
			if(queue.size() == 1)
				sb.append(queue.poll()).append(">");
			else
				sb.append(queue.poll()).append(", ");
		}
		
		System.out.print(sb);
		
	}
}
