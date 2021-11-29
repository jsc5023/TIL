import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		
		System.out.print(solution(citations));
	}
	
	public static int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        int cnt = -1;
        for (int i = 0; i < citations.length; i++) {
 			if(citations[i] == 1) {
				
			}

		}
        
        return answer;
    }

}
