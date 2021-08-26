import java.util.Scanner;

public class Example4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = 0;
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			if(a > b) {
				temp = a;
				a = b;
				b = temp;
			}
			
			if(b > c) {
				temp = b;
				b = c;
				c = temp;
			}
			
			if(a * a + b * b == c*c) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		
	}

}
