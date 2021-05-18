import java.util.Scanner;

public class Example11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int sum = 0;
		
		String a = scan.next();
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(a.substring(i,i+1));

		}
		
		System.out.println(sum);
		scan.close();
	}
}
