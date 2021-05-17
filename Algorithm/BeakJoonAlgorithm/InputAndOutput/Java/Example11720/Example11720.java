import java.util.Scanner;

public class Example11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n = scan.nextDouble();
		
		int sum = 0;
		
		int a = scan.nextInt();
//		a = (int) (a % (Math.pow(10.0, n-1)));
		for(int i=0; i<n; i++) {
			int b = a / (int)(Math.pow(10.0, n-1));
			a = (int) (a % (Math.pow(10.0, n-1)));
			sum += b;
		}
		
		System.out.println(sum);
		scan.close();
	}
}
