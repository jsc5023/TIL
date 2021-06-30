import java.util.Scanner;

public class Example2522 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		for (int i = 0; i < n - 1; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j < n - 1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
