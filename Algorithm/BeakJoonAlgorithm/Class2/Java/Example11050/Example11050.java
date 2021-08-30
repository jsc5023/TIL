import java.util.Scanner;

public class Example11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �ٸ� ��ʷ� Ǯ� (dp����)
		int[][] dp = new int[11][11];
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		// nCk = n-1Ck-1 + n-1Ck (�Ľ�Į�� ��Ģ)
		// dp[i][k] = d[i-1][k-1] + dp[i-1][k]
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= Math.min(i, K); j++) {
				if(j == 0 || i == j) // j == 0�̸� 1�̰�, n == k �ϰ�쿡�� 1�̴�.
					dp[i][j] = 1;
				else
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}
		
		System.out.print(dp[N][K]);
	}
}
