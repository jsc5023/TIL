import java.util.Scanner;
public class Example2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int result = 0;
		int num = 0;
		for (int i = 0; i < N; i++) {
			num = i;
			
			while(num > 0) {
				result += num % 10;
				num /= 10;
			}
			
			result += i;
			
			if(result == N) {
				System.out.print(i);
				return;
			}
			
			result = 0;
		}
		
		System.out.print(0);
	}

}
