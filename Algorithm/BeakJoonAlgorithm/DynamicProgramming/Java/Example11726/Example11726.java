import java.util.Scanner;

public class Example11726 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] dp = new int[n+2];
		
		dp[0] = dp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i - 2]) % 10007;
		}
		
		System.out.print(dp[n]);
	}
}
