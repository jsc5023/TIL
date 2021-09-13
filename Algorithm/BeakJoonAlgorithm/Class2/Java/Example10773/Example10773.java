import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example10773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < K; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n != 0)
				stack.push(n);
			else
				stack.pop();
		}
		
		int sum = 0;
		for (Integer item : stack) {
			sum += item;
		}
		
		System.out.print(sum);
	}

}
