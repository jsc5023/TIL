import java.util.HashSet;

public class MakeBigNumber {

	static HashSet<String> stringSet = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1924";
		int k = 2;
		System.out.print(solution(number, k));
		
	}

	public static String solution(String number, int k) {
		StringBuilder answer = new StringBuilder();
        
		// ���ͳ� �����ؼ� ����Ǯ�����ϴ�.
		int idx = 0;
		int comp = 0;
		for (int i = 0; i < number.length() - k; i++) { // ���� ���� k-1��ŭ�� �ڸ����� ���� ���� ū ���� ���ؾ��մϴ�.
			comp = 0;
			for (int j = idx; j <= i+k; j++) {
				if(comp < number.charAt(j) - '0') { // 0�̾ƴ� �����ϰ��(1~9)
					comp = number.charAt(j) - '0';
					idx = j + 1;
				}
			}
			answer.append(comp);
		}
		
		return answer.toString();
    }
}
