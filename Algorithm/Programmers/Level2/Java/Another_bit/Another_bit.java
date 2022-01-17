
public class Another_bit {

	public static void main(String[] args) {
		long[] numbers = {2, 7};
		solution(numbers);
	}

	public static long[] solution(long[] numbers) {
		// 직접 만들어 보니까, 단순 반복문으로는 풀 수 없는 문제이다.
		// 홀수, 짝수를 구분하여 짝수일 경우, 홀수일경우 둘 로 나눠서 생각을 해야된다.
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
        	answer[i] = findBit(numbers[i]);
		}
        
        return answer;
    }
	
	public static long findBit(long number) {
		
		long result = number;
		String numberBinary = Long.toBinaryString(number);
		boolean checkCondition = false;
		
		if(number % 2 == 0)
			return result+1;
		while(!checkCondition) {
			result++;
			String nowBinary = Long.toBinaryString(result);
			if(Compare_Binary(numberBinary, nowBinary))
				checkCondition = true;
		}
		
		return result;
	}
	
	public static boolean Compare_Binary(String numberBinary, String nowBinary) {
		
		boolean compareResult = false;
		
		int cnt = 0;
		
		if(numberBinary.length() != nowBinary.length())
			numberBinary = "0" + numberBinary;
		
		for (int i = 0; i < numberBinary.length(); i++) {
			if(numberBinary.charAt(i) != nowBinary.charAt(i))
				cnt++;
			if(cnt > 3)
				break;
		}
		
		if(cnt > 0 && cnt <= 2)
			compareResult = true;
		
		return compareResult;
	}
}
