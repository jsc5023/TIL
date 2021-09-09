import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Example2164 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> cards = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			cards.offer(i);
		}
		
		int temp = 0;
		while(cards.size() > 1) {
			cards.poll();
			temp = cards.poll();
			cards.offer(temp);
		}
		
		System.out.print(cards.poll());
	}

}
