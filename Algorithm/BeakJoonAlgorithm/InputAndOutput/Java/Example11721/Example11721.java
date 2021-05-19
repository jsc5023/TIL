import java.util.Scanner;

public class Example11721 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		
		System.out.println(n.substring(0, 10));
		n = n.substring(10, n.length());
		System.out.println(n);
	}
}
