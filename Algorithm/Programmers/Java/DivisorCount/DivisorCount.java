
public class DivisorCount {

	public static void main(String[] args) {
		
		int left = 1;
		int right = 1;
		
		System.out.print(solution(left, right));
	}
	
	public static int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
			answer += divisorFind(i);
		}
        return answer;
    }
	
	public static int divisorFind(int number) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
			if(number % i == 0) {
				answer++;
			}
		}
        
        if(answer % 2 == 0)
        	return number;
        else
        	return -number;
    }
	

}
