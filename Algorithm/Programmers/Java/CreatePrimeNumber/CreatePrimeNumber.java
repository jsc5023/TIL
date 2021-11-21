import java.util.Arrays;

public class CreatePrimeNumber {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		System.out.print(solution(nums));
	}

	public static int solution(int[] nums) {

	    Arrays.sort(nums);
	    int sum = 0;
	    for (int i = nums.length - 1; i > nums.length - 4; i--) {
	    	sum += nums[i];
		}
        
	    int[] dp = new int[50001];
	    
       for (int i = 0; i <= Math.sqrt(sum); i++) {
    	   if(dp[i] == 0){
				for(int j = i*i; j<= (int)Math.sqrt(sum); j+=i) dp[i] = 1;
			}
       }
       
       int cnt = 0;
       for (int i = 0; i < nums.length; i++) {
    	   for (int j = i+1; j < nums.length; j++) {
    		   for (int k = j + 1; k < dp.length; k++) {
    			   if(dp[nums[i]+nums[j]+nums[k]] == 1) {
    				   cnt++;
    			   }
			   }
    	   }
       }
        return cnt;
    }
}