import java.util.Scanner;
public class Example1912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dt = new int[n+1];
		for (int i = 0; i < n; i++) {
			dt[i] = sc.nextInt();
		}
		
		int[] dp = new int[n+1];
		
		dp[0] = dt[0];
		
		int max = dp[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1] + dt[i], dt[i]);
			max = Math.max(dp[i], max);
		}
		
		System.out.print(max);
	}

}
