import java.util.Scanner;

public class Example2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N == 1) {
			System.out.print(1);
			return;
		}
		
		int sum = 1;
		int i = 0;
		while(true) {
			
			sum += 6 * (i++);
			
			if(sum >= N) {
				System.out.print(i);
				break;
			}
		}
	}

}
