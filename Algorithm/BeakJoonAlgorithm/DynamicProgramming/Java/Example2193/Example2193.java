import java.util.Scanner;

public class Example2193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long[] dp = new long[N+2];
		
		dp[0] = dp[1] = 1;
		
		for (int i = 2; i < N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		};
		
		System.out.print(dp[N-1]);
		
	}
}
