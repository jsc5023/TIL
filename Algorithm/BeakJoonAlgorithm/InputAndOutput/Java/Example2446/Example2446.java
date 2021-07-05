import java.util.Scanner;

public class Example2446 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i * 2; j < 2*(n - 1) + 1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		for (int i = 0; i < n - 1; i++) {
			
			for (int j = n - 2; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2*(i + 1) + 1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
