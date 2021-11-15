import java.util.Arrays;

public class Make_Min_Num {

	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
		System.out.print(solution(A,B));
	}
	
	public static int solution(int []A, int []B)
    {
		int multiNum = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		
        for (int i = 0; i < A.length; i++) {
        	multiNum += A[i] * B[A.length - i - 1];
		}
        
        return multiNum;
    }

}
