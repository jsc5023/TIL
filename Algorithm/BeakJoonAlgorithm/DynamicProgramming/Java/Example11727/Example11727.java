import java.util.Scanner;
public class Example11727 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] dp = new int[n+2];
		
		dp[0] = 1; dp[1] = 1; dp[2] = 3;
		for (int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007;
		}
		
		System.out.print(dp[n]);
	}

}
