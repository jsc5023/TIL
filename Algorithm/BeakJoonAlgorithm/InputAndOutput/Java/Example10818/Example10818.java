import java.util.Scanner;

public class Example10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int min = 1000001;
		int max = -1000001;
		
		for (int i = 0; i < n; i++) {
			int input = scan.nextInt();
			
			if(input > max)
				max = input;
			if(input < min)
				min = input;
		}
		
		System.out.println(min + " " + max);
	}
}
