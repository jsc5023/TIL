import java.util.Arrays;

public class CreatePrimeNumber {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		System.out.print(solution(nums));
	}

	public static int solution(int[] nums) {
        int answer = -1;
        
        Arrays.sort(nums);
        int sum = 0;
        for (int i = nums.length - 1; i > nums.length - 4; i--) {
        	sum += nums[i];
		}
        
       
        return answer;
    }
}