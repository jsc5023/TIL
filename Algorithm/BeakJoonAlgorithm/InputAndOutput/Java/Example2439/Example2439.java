import java.util.Scanner;

public class Example2439 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for(int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
