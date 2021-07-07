import java.util.Scanner;

public class Example10991 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = i; j < n - 1; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i * 2 + 1; j++) {
				if(j % 2 == 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}
	}
}
