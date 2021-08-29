import java.util.Scanner;

public class Example2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] bruteArr = new int[N+1];
		for (int i = 0; i < N; i++) {
			bruteArr[i] = sc.nextInt();
		}
		
		int result = 0;
		
		for (int i = 0; i < N-2; i++) {
			for (int j = i + 1; j < N-1; j++) {
				for (int k = j + 1; k < N; k++) {
					int sum = bruteArr[i] + bruteArr[j] + bruteArr[k];
					
					if(sum == M) {
						System.out.print(sum);
						return;
					}
					
					if(result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}
		
		System.out.print(result);
	}

}
