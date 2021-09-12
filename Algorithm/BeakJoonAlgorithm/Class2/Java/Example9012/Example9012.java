import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example9012 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			sb.append(solve(br.readLine())).append("\n");
		}
		
		System.out.print(sb.toString());
	}
	
	static String solve(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			if(c == '(') {
				stack.add(c);
			}
			else if(stack.isEmpty()) {
				return "NO";
			}
			else if(c == ')') {
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
