import java.util.Scanner;
public class Example2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// �ٽ��� 5�� �켱 ���� �������� ã�´�.(5���� ����ũ�� ������) ������ �������� �װ��� ���̹Ƿ� ����ϸ�ȴ�.
		// 5�� ���� �������� 0�̾ƴѰ��, 3�� ���� �ٽ� �ݺ��Ѵ�. (3��� �� ��츦 ã�°��̴�.)
		// �׸��� 5,3 �� �ּҰ������ 15, 3*5�϶� �ּ� �����, �� 5���� �ݺ��Ѵٸ�, ù��° �� ������ ��������������, 5�� �� ���Ĵ� ������ �ʿ䰡 ����.
		int cnt = 0;
		while(cnt < 5) {
			
			if(n % 5 == 0 & n >= 0) { // ������ ������ �������� �ʱ⶧��(�̰��� ������, -���� �Ǿ� �ݵ�� �������� 0�� �����⶧��)
				System.out.print(n / 5 + cnt);
				return;
			}
			n -= 3;
			cnt++;
		}
		
		System.out.print(-1);
	}

}
