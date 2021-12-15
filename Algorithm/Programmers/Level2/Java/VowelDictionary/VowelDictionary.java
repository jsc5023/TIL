public class VowelDictionary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "A";
		System.out.print(solution(word));
	}
	
	public static int solution(String word) {
		
		String str = "AEIOU";
		int[] multiNum = new int[5];
		
		multiNum[0] = 1;
		
		for (int i = 1; i < multiNum.length; i++) {
			multiNum[i] = multiNum[i - 1] * 5 + 1;
		}
		
		int[] x = {multiNum[4], multiNum[3], multiNum[2], multiNum[1], multiNum[0]};
		
		int idx = 0;
		int answer = word.length();
		
		for (int i = 0; i < word.length(); i++) {
			idx = str.indexOf(word.charAt(i));
			answer += x[i] * idx;
		}
		
		return answer;
	}
}
