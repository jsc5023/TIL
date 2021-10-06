import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Example11289 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a); // array.Sort의 Compare처럼 사용합니다. b - a의 우선순위는 숫자가 크면클수록 우선순위가 높아집니다.
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(queue.isEmpty())
					sb.append(0).append("\n");
				else {
					sb.append(queue.poll()).append("\n");
				}	
			}
			
			else {
				queue.offer(x);
			}
		}
		
		System.out.print(sb.toString());
	}

}
