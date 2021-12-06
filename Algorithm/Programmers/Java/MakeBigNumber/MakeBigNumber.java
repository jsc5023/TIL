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
        
		// 인터넷 참조해서 문제풀었습니다.
		int idx = 0;
		int comp = 0;
		for (int i = 0; i < number.length() - k; i++) { // 가장 뒤의 k-1만큼의 자리수를 빼고 가장 큰 수를 구해야합니다.
			comp = 0;
			for (int j = idx; j <= i+k; j++) {
				if(comp < number.charAt(j) - '0') { // 0이아닌 숫자일경우(1~9)
					comp = number.charAt(j) - '0';
					idx = j + 1;
				}
			}
			answer.append(comp);
		}
		
		return answer.toString();
    }
}
