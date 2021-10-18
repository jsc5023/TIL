import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Example11286 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
			
			if(Math.abs(a) < Math.abs(b)) {
				if(a > b)
					return b - a;
				else
					return a - b;
			}
			else if(Math.abs(a) == Math.abs(b))
				return a - b;
			else {
				if(a > b)
					return a - b;
				else
					return b - a;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(heap.isEmpty())
					sb.append(0).append("\n");
				else {
					int temp = heap.poll();
					sb.append(temp).append("\n");
				}
			}
			else {
				heap.add(x);
			}
		}
		
		System.out.println(sb.toString());
	}

}
