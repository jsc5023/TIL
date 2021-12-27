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

        int idx = 0;
        for (long i = left; i <= right; i++) {
        	// i / n�� ���ϴ� �Ŵ� ��
        	// i % n�� ���� �ִ밪 + 1
        	answer[idx++] = (int)Math.max(i/n, i%n) + 1;
		}
        
        return answer;
    }
}
