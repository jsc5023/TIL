import java.util.Scanner;

public class Example10951 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) { // EOF 가 있을떄 까지 반복, hasNext만 써도됩니다.
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a+b);
		}
		
		scan.close();
	}
	//입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 종료

}
