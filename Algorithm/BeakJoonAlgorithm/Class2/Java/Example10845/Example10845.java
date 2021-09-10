import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Example10845 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			
			switch (str[0]) {
				case "push":
					queue.offer(Integer.parseInt(str[1]));
					break;
					
				case "pop":
					if(queue.isEmpty())
						sb.append(-1).append("\n");
					else
						sb.append(queue.poll()).append("\n");
					break;
				
				case "size":
					sb.append(queue.size()).append("\n");
					break;
				
				case "empty":
					if(queue.isEmpty())
						sb.append(1).append("\n");
					else
						sb.append(0).append("\n");
					break;
					
				
				case "front":
					if(queue.isEmpty())
						sb.append(-1).append("\n");
					else
						sb.append(queue.peek()).append("\n");
					break;
					
				case "back":
					if(queue.isEmpty())
						sb.append(-1).append("\n");
					else
						sb.append(queue.getLast()).append("\n");
					break;
					
			}
		}
		
		System.out.print(sb.toString());
	}

}
