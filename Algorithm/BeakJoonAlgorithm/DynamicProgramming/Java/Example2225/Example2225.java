import java.util.Scanner;
public class Example2225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] dp = new int[201][201];
		
		for (int i = 0; i <= k; i++) {
			dp[0][i] = 1;
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
			}
		}
		
		System.out.print(dp[n][k]);
	}
}
