import java.util.Scanner;

public class Example2156 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] dt = new int[n + 1];
		int[] dp = new int[n + 2];
		
		for (int i = 0; i < n; i++) {
			dt[i] = scan.nextInt();
		}
		
		dp[1] = dt[0];
		dp[2] = dt[0] + dt[1];
		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i-3] + dt[i-2] + dt[i - 1];
			dp[i] = Math.max(dp[i], dp[i-2] + dt[i-1]);
			dp[i] = Math.max(dp[i], dp[i-1]);
			
		}
		
		System.out.print(dp[n]);
	}
}
