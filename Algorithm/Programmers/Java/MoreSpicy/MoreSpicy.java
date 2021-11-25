import java.util.PriorityQueue;

public class MoreSpicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = {10,5,20,15};
		int K = 16;
		
		System.out.print(solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
			queue.add(scoville[i]);
		}
        
        while(queue.peek() <= K) {
        	if(queue.size() == 1)
        		return -1;
        	
        	int first = queue.poll();
        	int second = queue.poll();
        	
        	int result = first + (second * 2);
        	
        	queue.offer(result);
        	answer++;
        }
        
        return answer;
    }
}
