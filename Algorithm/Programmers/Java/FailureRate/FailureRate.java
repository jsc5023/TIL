import java.util.Arrays;
import java.util.Collections;
public class FailureRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int[] stages = {1, 2, 3, 2, 1};
		
		solution(N, stages);
	}
	
	public static int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        
        Double[] arr = new Double[N];
        
        for (int i = 0; i < N; i++) {
        	int cnt = 0;
        	int cnt2 = 0;
			for (int j = 0; j < stages.length; j++) {
				if(i+1 == stages[j]) {
					cnt++;
				}
				
				if(stages[j] >= i+1) {
					cnt2++;
				}
			}
			
			double failure_rate = (double)cnt / cnt2;
			
			if(Double.isNaN(failure_rate)) // 주의 - 0으로 나누면 NaN이 나타나는 오류가 나타납니다.
				failure_rate = 0.0;
			arr[i] = failure_rate;
		}
        
        Double[] arr2 = arr.clone();
        
        Arrays.sort(arr2, Collections.reverseOrder());
        
        int[] answer = new int[N];
        for (int i = 0; i < arr2.length; i++) {
        	for (int j = 0; j < arr.length; j++) {
				if(arr2[i] == arr[j]) {
					answer[i] = j + 1;
					break;
				}
			}
		}
        
        return answer;
    }
}
