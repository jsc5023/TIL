
public class Pair_To_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baabaa";
		System.out.print(solution(s));
	}
	
	public static int solution(String s)
    {
        int answer = 1;

        String nowString = s;
        while(nowString.length() > 0) {
        	
        	String resultString = removeString(nowString);
        	
        	if(resultString.equals(nowString)) {
        		answer=0;
        		break;
        	}
        	else {
        		nowString = resultString; 
        	}
        }
        
        return answer;
    }
	
	public static String removeString(String nowString) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nowString);
		for (int i = 0; i < sb.length() - 1; i++) {
			if(sb.charAt(i) == sb.charAt(i + 1)) {
				sb.deleteCharAt(i);
				sb.deleteCharAt(i);
				break;
			}
		}
		
		return sb.toString();
	}

}
