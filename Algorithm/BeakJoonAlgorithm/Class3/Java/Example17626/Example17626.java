import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example17626 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		int min = 0;
		
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 1; i <= n; i++) {
			min = Integer.MAX_VALUE;
			
			for (int j = 1; j * j <= i; j++) {
				
				min = Math.min(min, dp[i - (j * j)]);
			}
			
			dp[i] = min + 1;
		}
		
		System.out.print(dp[n]);
	}

}
