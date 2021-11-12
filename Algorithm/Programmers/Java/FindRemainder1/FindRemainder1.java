
public class FindRemainder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		
		System.out.print(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i < n; i++) {
			if(n % i == 1) {
				answer = i;
				break;
			}
		}
        return answer;
    }

}
