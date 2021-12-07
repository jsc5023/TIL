import java.util.Stack;

public class CorrectParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ")()(";
		System.out.print(solution(s));
	}
	
	static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        char[] getchar = s.toCharArray();
        for (int i = 0; i < getchar.length; i++) {
        	if(getchar[i] == '(')
        		stack.add(getchar[i]);
        	
        	else if(getchar[i] == ')') {
        		if(stack.isEmpty())
        			return false;
        		else
        			stack.pop();
        	}
		}
        
        if(stack.isEmpty())
        	return true;
        else
        	return false;
    }

}
