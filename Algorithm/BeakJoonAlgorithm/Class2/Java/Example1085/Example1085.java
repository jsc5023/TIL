import java.util.Scanner;
public class Example1085 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min = Math.min(x -0, w-x);
		min = Math.min(min, y-0);
		min = Math.min(min, h-y);
		
		System.out.print(min);
	}
}
