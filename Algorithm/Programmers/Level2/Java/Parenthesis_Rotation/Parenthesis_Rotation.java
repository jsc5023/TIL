import java.util.Stack;

public class Parenthesis_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "}]()[{";
		System.out.print(solution(s));
	}

	public static int solution(String s) {
        int answer = 0;
        
        String nowStr = s;
        for (int i = 0; i < s.length(); i++) {
			nowStr = nowStr.substring(1) + nowStr.substring(0, 1);
			if(isCorrectParenthesis(nowStr))
				answer++;
		}
        return answer;
    }
	
	public static boolean isCorrectParenthesis(String nowStr) {
		
		Stack<Character> stack = new Stack<>();
		char[] charArr = nowStr.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			char nowChar = charArr[i];
			if(nowChar == '[' || nowChar == '(' || nowChar == '{')
				stack.push(nowChar);
			else {
				if(stack.isEmpty())
					return false;
				else
				{
					if(nowChar == ')' && stack.peek() == '('){
	                    stack.pop();
	                }else if(nowChar == '}' && stack.peek() == '{'){
	                	stack.pop();
	                }else if(nowChar == ']' && stack.peek() == '['){
	                	stack.pop();
	                }
				}
			}
		}
		
		if(!stack.isEmpty())
			return false;
		return true;
	}
}
