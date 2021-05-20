import java.util.Scanner;

public class Example11721 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		
		while(true) {
			if(n.length() > 10) {
				System.out.println(n.substring(0, 10));
			}
			else {
				System.out.println(n.substring(0, n.length()));
				break;
			}
			
			n = n.substring(10, n.length());
		}
	}
}
