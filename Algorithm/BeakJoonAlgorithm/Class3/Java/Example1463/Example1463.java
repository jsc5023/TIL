import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example1463 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N+3];
		
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		
		
		for (int i = 4; i <= N; i++) {
			int min = Integer.MAX_VALUE;
			
			min = Math.min(min, dp[i - 1] + 1);
			if(i % 2 == 0)
				min = Math.min(min, dp[i / 2] + 1);
			if(i % 3 == 0)
				min = Math.min(min, dp[i / 3] + 1);
			
			dp[i] = min;
		}
		
		System.out.print(dp[N]);
	}

}
