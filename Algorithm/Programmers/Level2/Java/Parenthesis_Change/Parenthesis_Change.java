import java.util.Stack;

public class Parenthesis_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = ")(";
		System.out.print(solution(p));
	}

	public static String solution(String p) {
        String answer = "";
        
        Stack<Character> stack = new Stack<>();
        
        String[] arrStr = new String[p.length()];
        
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
        	
        	if(stack.isEmpty())
        		return p;
        	
        }
        return answer;
    }
	
	public static boolean check(String p) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == '(')
    			stack.add(p.charAt(i));
			else {
				if(stack.isEmpty())
					return false;
				else
					return true;
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}
	
	public static String dfs(String s) {
		if(s.length() == 0 )
			return "";
		String u = "";
		String v = "";
		
		return s;
	}
}
