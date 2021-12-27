import java.util.HashMap;

public class nPow2Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		long left = 2;
		long right = 5;
		solution(n, left, right);
	}
	
	 public static int[] solution(int n, long left, long right) {
		
		int answerLength = (int)(right - left) + 1;
        int[] answer = new int[answerLength];
        
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = i + 1;
				arr[j][i] = i + 1;
			}
		}
        
        long idx = -1;
        int arrIdx = 0;
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				idx++;
				if((idx >= left) && (right >= idx)) {
					answer[arrIdx++] = arr[i][j];
				}
			}
		}
        
        
        return answer;
    }
}
