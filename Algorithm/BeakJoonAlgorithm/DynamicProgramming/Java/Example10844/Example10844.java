import java.util.Scanner;

public class Example10844 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] dp = new int[n+1][10];
		
		dp[1][0] = 0;
		
		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		for (int i = 2; i <= n ; i++) {
			dp[i][0] = (dp[i-1][0+1]) % 1000000000;
			
			dp[i][1] = (0 == dp[i-1][0]) ? 1 : dp[i-1][0]; // 0이면 1로계산, 아니면 그냥 그대로 들고온다
			dp[i][1] += dp[i-1][2]; // 1이면 10, 12의값을 가지므로
			dp[i][1] %= 1000000000;
			
			for (int j = 2; j <= 8; j++) {
				dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
			}
			
			dp[i][9] = (dp[i-1][8] % 1000000000);
		}
		
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum += dp[n][i];
			sum %= 1000000000;
		}
		
		System.out.print(sum);
		
	}
}
