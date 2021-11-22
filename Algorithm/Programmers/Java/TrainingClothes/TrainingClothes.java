import java.util.Arrays;

public class TrainingClothes {

	public static void main(String[] args) {
		int n = 6;
		int[] lost = {1};
		int[] reserve = {6};
		
		System.out.print(solution(n, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        boolean[] arr = new boolean[n + 2];
        
        Arrays.fill(arr, true);
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        arr[0] = false;
        for (int i = 0; i < lost.length; i++) {
			arr[lost[i]] = false;
		}
        
        for (int i = 0; i < reserve.length; i++) {
        	if(arr[reserve[i]] == false) {
				arr[reserve[i]] = true;
				reserve[i] = 0;
			}
		}
        
        for (int i = 0; i < reserve.length; i++) {
        	if(reserve[i] - 1 > 0 && arr[reserve[i] - 1] == false) {
				arr[reserve[i] - 1] = true;
			}
			else if(arr[reserve[i] + 1] == false && reserve[i] + 1 <= n) {
				arr[reserve[i] + 1] = true;
			}
		}
        
        for (int i = 1; i < arr.length - 1; i++) {
        	if(arr[i] == true)
        		answer++;
		}
        
        return answer;
    }
}
