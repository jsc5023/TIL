import java.util.Scanner;

public class Example11055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dt = new int[n+1];
		
		for (int i = 0; i < n; i++) {
			dt[i] = sc.nextInt();
		}
		
		int[] dp = new int[n+1];
		dp[0] = dt[0];
		int result = 0;
		result = dp[0];		
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if(dt[j] < dt[i]) {
					dp[i] = Math.max(dp[i], dp[j]);
				}
			}
			
			dp[i] += dt[i];
			result = Math.max(result, dp[i]);
		}
		
		System.out.print(result);
	}

}
