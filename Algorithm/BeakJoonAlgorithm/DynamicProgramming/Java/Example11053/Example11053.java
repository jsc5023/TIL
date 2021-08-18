import java.util.Scanner;

public class Example11053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dt = new int[n+1];
		
		for(int i = 0; i < n; i++) {
			dt[i] = sc.nextInt();
		}
		
		int[] dp = new int[n+1];
		
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(dt[j] < dt[i] && dp[j] + 1 > dp[i])
					dp[i] = dp[j] + 1;
			}
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp[i], max);
		}
		System.out.print(max);
	}
}
