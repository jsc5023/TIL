
public class TriangularSnail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.print(solution(n));
	}

	public static int[] solution(int n) {
        int[] dp = new int[n*(n+1) / 2];
        int[][] arr = new int[n][n];
        // ÂüÁ¶
        int x = -1, y = 0;
        int num = 1;
        
        for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if(i % 3 == 0) // if(x == 0) 
					x++;
				else if(i % 3 == 1)
					y++;
				else if(i % 3 == 2) {
					x--;
					y--;
				}
				arr[x][y] = num++;
			}
		}
        
        int k = 0;
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i][j] == 0)
					break;
				dp[k++] = arr[i][j];
			}
		}
        
        return dp;
    }
}
