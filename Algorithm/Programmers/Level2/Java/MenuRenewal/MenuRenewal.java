import java.util.HashMap;
import java.util.PriorityQueue;

public class MenuRenewal {

	public static HashMap<String, Integer> map;
	static int max;
	public static void main(String[] args) {
		// https://gwang920.github.io/algorithm/progreammers-1-72411/ ÂüÁ¶
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		System.out.print(solution(orders, course));
	}
	
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        PriorityQueue<String> queue = new PriorityQueue<>();
        
        for (int i = 0; i < course.length; i++) {
        	map = new HashMap<>();
        	max = 0;
        	
        }
	
        return answer;
    }

}
