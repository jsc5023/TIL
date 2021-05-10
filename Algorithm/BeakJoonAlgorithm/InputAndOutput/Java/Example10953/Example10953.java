import java.util.Scanner;

public class Example10953 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			String[] s = scan.next().split(",");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			System.out.println(a+b);
		}
	}
}
