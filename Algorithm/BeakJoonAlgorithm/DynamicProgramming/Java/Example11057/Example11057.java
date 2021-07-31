import java.util.Scanner;

public class Example11057 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[][] dp = new int[N+1][10];
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					dp[i][j] = (dp[i][j] + dp[i-1][k]) % 10007;
				}
			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			sum = (sum + dp[N][i]) % 10007;
		}
		
		System.out.print(sum);
	}
}
