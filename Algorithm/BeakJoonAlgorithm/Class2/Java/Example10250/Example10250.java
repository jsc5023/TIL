import java.util.Scanner;

public class Example10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int result = 0;
			if(N % H == 0) {
				result = H * 100 + (N / H);
			}
			else {
				result = (N % H) * 100 + (N/H) + 1;
			}
			
			System.out.println(result);
		}
	}

}
