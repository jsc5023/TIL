import java.util.Scanner;

public class Example10992 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2*i + 1; j++) {
				
				if(i == n - 1)
					System.out.print("*");
				else if(j == 0)
					System.out.print("*");
				else if(j == 2*i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("\n");
		}
	}
}
