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
			int temp = 0; // temp���� �����Ǵ� ���󶧹���, i�ݺ��� �ȿ��� �ٽ� �ʱ�ȭ ������� �˴ϴ�.
			for (int j = 1; j <= 14; j++) {
				temp += dp[i-1][j]; // dp[i][j] +=  dp[i-1][j] ��� ����ȵ�, �ֳ��ϸ� 1,3�ϰ�� 0,3�� ���� ������ 0,1 0,2 �ǰ��� ������������
				// ���� �����ؼ� ���������� temp�� ��ó�� �������� ������ ���� ���� �ʿ��մϴ�.
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
