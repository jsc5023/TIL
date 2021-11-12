import java.util.Arrays;

public class LottoHighLow {

	public static void main(String[] args) {
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] answer = solution(lottos, win_nums);
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
        int min = 0;
        int zeroCount = 0;
        for (int i = 0; i < lottos.length; i++) {
        	if(lottos[i] == 0)
        		zeroCount++;
			for (int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					min++;
				}
			}
		}
        
        int max = min + zeroCount;
        
        int minRank = findRank(min);
        int maxRank = findRank(max);
        int[] answer = {maxRank, minRank};
        
        return answer;
    }
	
	public static int findRank(int num) {
		
		int result = 0;
		switch (num) {
			case 6:
				result = 1;
				break;
			case 5:
				result = 2;
				break;
			case 4:
				result = 3;
				break;
			case 3:
				result = 4;
				break;
			case 2:
				result = 5;
				break;
			default:
				result = 6;
				break;
		}
		
		return result;
	}
}
