import java.util.Scanner;

public class Example1699 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dp = new int[n+2];
		
		
		for (int i = 1; i <= n; i++) {
			dp[i] = i;
			for (int j = 2; j*j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}
		}
		
		System.out.print(dp[n]);
	}

}
