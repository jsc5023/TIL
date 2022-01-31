import java.util.Stack;

public class Parenthesis_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "(()())()";
		System.out.print(Solution(p));
	}

	public static String solution(String p) {
        String answer = "";
        
        Stack<Character> stack = new Stack<>();
        if(p.isBlank())
        	return "";
        else {
        	for (int i = 0; i < p.length(); i++) {
        		if(p.charAt(i) == '(')
        			stack.add(p.charAt(i));
    			else {
    				Character nowChar = stack.peek();
    				
    				if(nowChar == '(') {
    					stack.pop();
    				}
    			}
    				
			}
        	
        }
        return answer;
    }
}
