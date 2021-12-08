
public class NextBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 78;
		
		System.out.print(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        String a2 = Integer.toBinaryString(n);
        char[] chars_a2 = a2.toCharArray();
        int cnt_a2 = 0;
        
        for (int i = 0; i < chars_a2.length; i++) {
			if(chars_a2[i] == '1')
				cnt_a2++;
		}
        
        int nextNum = n + 1;
        
        while(nextNum <= 1000000) {
        	String a2_nextNum = Integer.toBinaryString(nextNum);
        	char[] chars_a2_nextNum = a2_nextNum.toCharArray();
            int cnt_a2_nextNum = 0;
            
            for (int i = 0; i < chars_a2_nextNum.length; i++) {
    			if(chars_a2_nextNum[i] == '1')
    				cnt_a2_nextNum++;
    		}
            
            if(cnt_a2_nextNum == cnt_a2)
            	return nextNum;
            nextNum++;
        }
        
        return answer;
    }
}
