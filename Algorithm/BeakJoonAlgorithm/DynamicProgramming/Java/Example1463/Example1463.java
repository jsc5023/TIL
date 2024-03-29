import java.util.Scanner;

public class Example1463 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int[] n = new int[X+1];
		
		n[0] = n[1] = 0;
		
		for (int i = 2; i <= X; i++) {
			n[i] = n[i-1] + 1;
			
			if(i % 2 == 0)
				n[i] = Math.min(n[i], n[i/2] + 1) ;
			if(i % 3 == 0)
				n[i] = Math.min(n[i], n[i/3] + 1);
		}
		System.out.print(n[X]);
	}
}
