import java.util.Scanner;

public class Example2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dt = new int[n+1];
		
		for (int i = 0; i < n; i++) {
			dt[i] = sc.nextInt();
		}
		
		int[] dp = new int[n+1];
		
		
		dp[1] = dt[0];
		
		if(n > 1) {
			dp[2] = dt[0] + dt[1];
		}
		
		if(n > 2) {
			for (int i = 3; i <= n; i++) {
				dp[i] = dp[i-3] + dt[i - 2] + dt[i - 1];
				dp[i] = Math.max(dp[i], dp[i-2] + dt[i - 1]);
				dp[i] = Math.max(dp[i], dt[i - 1]);
			}	
		}

		
		System.out.print(dp[n]);
	}

}
