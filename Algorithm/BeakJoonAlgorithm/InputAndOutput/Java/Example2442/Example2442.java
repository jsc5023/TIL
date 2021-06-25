import java.util.Scanner;

public class Example2442 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
