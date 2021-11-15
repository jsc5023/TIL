import java.util.Deque;
import java.util.LinkedList;

public class Ternary_flip {

	public static void main(String[] args) {

		int n = 45;
		System.out.print(solution(n));
	}

	public static int solution(int n) {
        int answer = 0;

        Deque<String> queue = new LinkedList<>();
        String s = "";
        while(n > 0) {
        	Integer div = n % 3;
        	queue.addFirst(div.toString());
        	n /= 3;
        }
        
        while(!queue.isEmpty()) {
        	s += queue.pollLast();
        }
        
//        System.out.print(s);
        
        for (int i = 0; i < s.length(); i++) {
        	answer += Integer.parseInt(Character.toString(s.charAt(i))) * Math.pow(3, (s.length() - 1 - i));
		}
        
        return answer;
    }
}
