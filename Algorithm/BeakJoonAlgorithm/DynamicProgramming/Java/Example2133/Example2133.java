import java.util.Scanner;
public class Example2133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[] dp = new int[n+7];
		
		dp[0] = 1; // 원래는 0이지만, 계산의 편의를 위해 1로두었음
		dp[1] = 0;
		dp[2] = 3;
		dp[3] = 0;
		dp[4] = dp[2] * dp[2] + 2;
		dp[5] = 0; 
		dp[6] = dp[4] * dp[2] + dp[2] * 2 + dp[0] * 2;
		
		for (int i = 7; i <= n; i++) {
			if(i % 2 == 1)
				continue;
			dp[i] += dp[i-2] * dp[2];
			for (int j = 0; j <= i-4; j++) {
				dp[i] += dp[j] * 2;
			}	
		}
		
		System.out.print(dp[n]);
	}

}
