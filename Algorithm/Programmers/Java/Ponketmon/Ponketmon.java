import java.util.HashSet;

public class Ponketmon {

	public static void main(String[] args) {
		
		int[] nums = {3,1,2,3};
		
		System.out.print(solution(nums));
	}
	
	 public static int solution(int[] nums) {
        HashSet<Integer> set= new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
        
        if(set.size() > nums.length / 2) {
        	return nums.length / 2;
        }
        else {
        	return set.size();
        }
        
    }
}
