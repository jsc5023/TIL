import java.util.Stack;

public class Parenthesis_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "()))((()";
		System.out.print(solution(p));
	}

	public static String solution(String p) {
		// 인터넷 참조 풀이(https://ilmiodiario.tistory.com/91)
		
        if(check(p))
        	return p;
        return dfs(p);
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
					stack.pop();
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}
	
	public static String dfs(String s) {
		if(s.length() == 0)
			return "";
		
		String u = "";
		String v = "";
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(')
				cnt1++;
			else
				cnt2++;
			if((cnt1 != 0 && cnt2 != 0) && (cnt1 == cnt2)) {
				u = s.substring(0, i+1);
				if(i != s.length() - 1)
					v = s.substring(i+1, s.length());
				break;
			}
		}
		
		if(!check(u)) {
			String tmp = "(" + dfs(v);
			tmp += ")";
			u = u.substring(1, u.length() - 1).replace("(", ".").replace(")", "(").replace(".", ")");
			tmp += u;
			return tmp;
		}
		else
			return u + dfs(v);
	}
}
