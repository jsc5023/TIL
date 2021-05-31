import java.util.Iterator;
import java.util.Scanner;

public class Example1924 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		// 이번엔 배열로 풀어봅시다
		int[] monthday = {0,31,28,31,30,31,30,31,31,30,31,30 };
		
		int sumday = monthday[x - 1] + y;
		String outputday = "";
		switch (sumday % 7) {
		case 0:
			outputday = "SUN";
			break;
		case 1:
			outputday = "MON";
			break;
		case 2:
			outputday = "TUE";
			break;
		case 3:
			outputday = "WED";
			break;
		case 4:
			outputday = "THU";
			break;
		case 5:
			outputday = "FRI";
			break;
		case 6:
			outputday = "SAT";
			break;
		}
		
		System.out.println(outputday);
	}
}
