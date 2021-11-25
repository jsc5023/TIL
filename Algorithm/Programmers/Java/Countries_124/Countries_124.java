
public class Countries_124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21;
		
		System.out.print(solution(n));
	}
	
	public static String solution(int n) {
        String answer = "";
        
        while(n > 0) {
            int b = n % 3;
            String add = "";
            switch (b) {
    			case 0: 
    				n = n / 3;
    				n = n - 1;
    				answer = "4" + answer;
    				break;
    			case 1: 
    				add = "1";
    				answer = add + answer;
    				n = n / 3;
    				break;
    			case 2: 
    				add = "2";
    				answer = add + answer;
    				n = n / 3;
    				break;
    		}
        }
        return answer;
    }

}
