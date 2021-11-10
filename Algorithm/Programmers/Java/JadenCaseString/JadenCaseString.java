import java.util.LinkedList;
import java.util.Queue;

public class JadenCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String S = "S  sss ffga % 44 33!! $$       ";
		String S = "For The Last Week";
		System.out.print(solution(S));
	}
	
	public static String solution(String s) {
		String answer = "";
		
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				queue.offer(i);
			}
		}
		
		int spaceIndex = 0;
		
		if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
			String firstStr = Character.toString(s.charAt(0)).toUpperCase();
			answer += firstStr;
		}
		else {
			answer += Character.toString(s.charAt(0));
		}
		
		for (int i = 1; i < s.length(); i++) {
			if(!queue.isEmpty() && queue.peek() == i) {
				spaceIndex = queue.poll();
				answer += " ";
			}
			else {
				if(spaceIndex != 0 && spaceIndex == i - 1) {
					if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
						String firstStr = Character.toString(s.charAt(i)).toUpperCase();
						answer += firstStr;
					}
					else {
						answer += Character.toString(s.charAt(i));
					}
				}
				else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
					String nowStr = Character.toString(s.charAt(i)).toLowerCase();
					answer += nowStr;
				}
				else {
					answer += Character.toString(s.charAt(i));
				}
			}
		}
        return answer;
	}

}
