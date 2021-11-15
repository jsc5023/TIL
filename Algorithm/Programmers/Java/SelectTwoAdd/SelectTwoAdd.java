import java.util.Arrays;
import java.util.HashSet;

public class SelectTwoAdd {

	public static void main(String[] args) {
		
		int[] numbers = {2,1,3,4,1};
		
		int[] answer = solution(numbers);
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		
	}
	
	public static int[] solution(int[] numbers) {
       
        
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				hs.add(numbers[i] + numbers[j]);
			}
		}
        
        int index = 0;
        
        int[] answer = new int[hs.size()];
        for (int item : hs) {
        	answer[index++] = item;
		}
        
        Arrays.sort(answer);
        
        return answer;
    }

}
