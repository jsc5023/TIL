import java.util.Scanner;

public class Example10951 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) { // EOF �� ������ ���� �ݺ�, hasNext�� �ᵵ�˴ϴ�.
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a+b);
		}
		
		scan.close();
	}
	//�Է¿��� ���̻��� ���� �� �ִ� �����Ͱ� �������� ���� �� ����

}
