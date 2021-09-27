import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example2579 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N+4];
		int[] temp = new int[2];
		if(N >= 1) {
			dp[1] = Integer.parseInt(br.readLine());
		}
		if(N >= 2) {
			temp[0] = Integer.parseInt(br.readLine());
			dp[2] = dp[1] + temp[0];
		}
		if(N >= 3) {
			temp[1] = Integer.parseInt(br.readLine());
			dp[3] = Math.max(dp[1], temp[0]) + temp[1];
			temp[0] = temp[1];
		}
		
		for (int i = 4; i <= N; i++) {
			temp[1] = Integer.parseInt(br.readLine());
			dp[i] = Math.max(dp[i - 3] + temp[0] + temp[1], dp[i - 2] + temp[1]);
			temp[0] = temp[1];
		}
		
		System.out.print(dp[N]);
		
	}

}
