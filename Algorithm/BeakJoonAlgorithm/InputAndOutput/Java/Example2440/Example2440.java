import java.util.Scanner;

public class Example2440 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for(int j = n; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
