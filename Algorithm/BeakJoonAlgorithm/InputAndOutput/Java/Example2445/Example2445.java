import java.util.Scanner;

public class Example2445 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			
			for (int j = (n - i - 1) * 2; j > 0; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		for (int i = 0; i < n; i++) {
			
			for (int j = n; j > i + 1; j--) {
				System.out.print("*");
			}
			
			for (int j = 0; j < (i + 1) * 2; j++) {
				System.out.print(" ");
			}
			
			for (int j = n; j > i + 1; j--) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
