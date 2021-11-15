
public class Fibonacci_number {

	static int dp[] = new int[100001];
	
	public static void main(String[] args) {
		
		int n = 5000;
		
		dp[1] = 1;
		dp[2] = 1;
		System.out.print(solution(n));
	}
	
	public static int solution(int n) {
        if(dp[n] != 0) {
        	return dp[n];
        }
        else if(n == 1) {
        	return dp[1];
        }
        else if(n == 2) {
        	return dp[2];
        }
        else {
        	dp[n] = solution(n - 1) % 1234567 + solution(n - 2) % 1234567;
        	dp[n] %= 1234567;
        }
        
        return dp[n];
    }

}
