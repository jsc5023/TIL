import java.util.Scanner;

public class Example9465 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for (int i = 0; i < T; i++) {
			int n = scan.nextInt();
			
			int[][] StartDp = new int[2][n+1]; // 2¥¬ row -> ∞Ì¡§
			for (int j = 0; j < n; j++) {
				StartDp[0][j] = scan.nextInt();
			}
			
			for (int j = 0; j < n; j++) {
				StartDp[1][j] = scan.nextInt();
			}
			
			int[][] resultDp = new int[2+1][n+1];
			
			resultDp[1][1] = StartDp[0][0];
			resultDp[2][1] = StartDp[1][0];
			
			for (int j = 2; j <= n; j++) {
				resultDp[0][j] = Math.max(resultDp[1][j-1], resultDp[2][j-1]);
				resultDp[1][j] = Math.max(resultDp[0][j-1], resultDp[2][j-1]) + StartDp[0][j-1];
				resultDp[2][j] = Math.max(resultDp[0][j-1], resultDp[1][j-1]) + StartDp[1][j-1];
			}
			
			System.out.println(Math.max(resultDp[1][n], resultDp[2][n]));
		}
	}
}
