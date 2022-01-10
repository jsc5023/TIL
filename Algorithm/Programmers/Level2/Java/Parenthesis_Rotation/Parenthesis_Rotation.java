import java.util.HashSet;
import java.util.Set;

public class Parenthesis_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "[](){}";
		System.out.print(solution(s));
	}

	public static int solution(String s) {
        int answer = 0;
        
        Set<String> hs = new HashSet<>();
        
        String nowStr = s;
        for (int i = 0; i < s.length(); i++) {
			nowStr = nowStr.substring(1) + nowStr.substring(0, 1);
			if(isCorrectParenthesis(nowStr))
				answer++;
		}
        return answer;
    }
	
	public static boolean isCorrectParenthesis(String nowStr) {
		
		return true;
	}
}
