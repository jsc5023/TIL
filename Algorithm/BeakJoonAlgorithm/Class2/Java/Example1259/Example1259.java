import java.util.Scanner;

public class Example1259 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			
			if(str.charAt(0) == '0')
				return;
			int left = 0;
			int right = str.length() - 1;
			
			while(left < right) {
				if(str.charAt(left) != str.charAt(right)) {
					System.out.println("no");
					break;
				}
				
				left++;
				right--;
			}
			
			if(left >= right) {
				System.out.println("yes");
			}
		}
	}
}
