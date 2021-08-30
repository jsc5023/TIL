import java.util.Scanner;

public class Example11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 다른 사례로 풀어봄 (dp형식)
		int[][] dp = new int[11][11];
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		// nCk = n-1Ck-1 + n-1Ck (파스칼의 법칙)
		// dp[i][k] = d[i-1][k-1] + dp[i-1][k]
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= Math.min(i, K); j++) {
				if(j == 0 || i == j) // j == 0이면 1이고, n == k 일경우에도 1이다.
					dp[i][j] = 1;
				else
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}
		
		System.out.print(dp[N][K]);
	}
}
