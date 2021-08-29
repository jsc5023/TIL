import java.util.Scanner;

public class Example2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[][] dp = new int[16][16];
		
		for (int i = 1; i <= 14; i++) {
			dp[0][i] = i;
		}
		
		for (int i = 1; i <= 14; i++) {
			int temp = 0; // temp값이 누적되는 현상때문에, i반복문 안에서 다시 초기화 시켜줘야 됩니다.
			for (int j = 1; j <= 14; j++) {
				temp += dp[i-1][j]; // dp[i][j] +=  dp[i-1][j] 라고 쓰면안됨, 왜냐하면 1,3일경우 0,3의 값만 더해짐 0,1 0,2 의값은 더해지지않음
				// 따라서 누적해서 더해질려면 temp의 값처럼 누적으로 저장해 놓을 값이 필요합니다.
				dp[i][j] = temp;
			}
		}
		
		while(T-- > 0) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(dp[k][n]);
		}
	}

}
