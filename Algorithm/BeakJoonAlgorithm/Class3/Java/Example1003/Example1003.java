import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example1003 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[41][41];
		
		dp[0][0] = 1;
		dp[1][0] = 0;
		
		dp[0][1] = 0;
		dp[1][1] = 1;
		
		
		for (int i = 0; i <= 1; i++) {
			for (int j = 2; j <= 40; j++) {
				dp[i][j] = dp[i][j-1] + dp[i][j-2];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			sb.append(dp[0][N] + " " + dp[1][N]).append("\n");
			
		}
		
		System.out.print(sb);
	}

}
