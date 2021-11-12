
public class StringAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2three45sixseven";
		
		System.out.print(solution(s));
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        String answerString = "";
        String numberString = "";
        
        for (int i = 0; i < s.length(); i++) {
			
        	if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
        		numberString += s.charAt(i);
        	}
        	else {
        		answerString += s.charAt(i);
        	}
        	
        	if(parseNumberString(numberString) < 10) {
        		answerString += parseNumberString(numberString);
        		numberString = "";
        	}
		}
        
        answer = Integer.parseInt(answerString);
        
        return answer;
    }
	
	public static int parseNumberString(String s) {
		
		int toNumber = 10;
		
		switch (s) {
			case "zero":
				toNumber = 0;
				break;
			case "one":
				toNumber = 1;
				break;
			case "two":
				toNumber = 2;
				break;
			case "three":
				toNumber = 3;
				break;
			case "four":
				toNumber = 4;
				break;
			case "five":
				toNumber = 5;
				break;
			case "six":
				toNumber = 6;
				break;
			case "seven":
				toNumber = 7;
				break;
			case "eight":
				toNumber = 8;
				break;
			case "nine":
				toNumber = 9;
				break;
		}
		
		return toNumber;
	}
}
