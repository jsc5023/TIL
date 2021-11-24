import java.util.Comparator;
import java.util.PriorityQueue;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.print(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
			queue.offer(priorities[i]);
		}
        
        while(!queue.isEmpty()) {
        	for (int i = 0; i < priorities.length; i++) {
				if(priorities[i] == queue.peek()) {
					if(location == i) {
						return answer;
					}
					answer++;
					queue.poll();
				}
			}
        }
        return answer;
    }
}
