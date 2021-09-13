import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example4949 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("."))
				break;
			sb.append(solve(str)).append("\n");
		}
		
		System.out.print(sb.toString());
	}
	
	static String solve(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(' || c== '[')
				stack.push(c);
			
			else if(c == ')') {
				
				if(stack.isEmpty() || stack.peek() != '(')
					return "no";
				else
					stack.pop();
					
			}
			
			else if(c == ']') {
				if(stack.isEmpty() || stack.peek() != '[')
					return "no";
				else
					stack.pop();
			}
		}
		
		if(stack.isEmpty())
			return "yes";
		else
			return "no";

	}

}
