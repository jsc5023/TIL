import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Example1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.nextLine();
		
		String[] str = new String[N];
		
		for (int i = 0; i < N; i++) {
			str[i] = sc.nextLine();
		}
		
		// ���Ⱑ �ٽ�, sort �� ����
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String a, String b) {
				if(a.length() == b.length()) {
					return a.compareTo(b);
				}
				
				else {
					return Integer.compare(a.length(), b.length());
				}
			}
		});
		
		System.out.println(str[0]);
		
		// �ߺ��Ǵ� �� ����(������ �̹� �����Ƿ�, �ߺ��� �����ؼ� ���´�.)
		for (int i = 1; i < N; i++) {
			if(!str[i].equals(str[i-1]))
				System.out.println(str[i]);
		}
	}

}
