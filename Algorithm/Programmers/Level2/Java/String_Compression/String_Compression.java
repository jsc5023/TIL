
public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababcdcdababcdcd";
		System.out.print(solution(s));
	}
	
    public static int solution(String s) {
    	
    	int answer = Integer.MAX_VALUE;
    	
    	if(s.length() == 1)
    		return 1;
    	
    	for (int i = 1; i < s.length() / 2; i++) {
			
    		String nowAddStr = "";
    		String tempStr = "";
    		int cnt = 1;
    		
    		for (int j = 0; j < s.length() / i; j++) {
				
    			if(tempStr.equals(s.substring(j * i, (j * i) + i))) {
    				cnt++;
    				continue;
    			}
    			
    			if(cnt == 1) {
        			nowAddStr += tempStr;
    			}
    			else {
    				nowAddStr += cnt + tempStr;
                    cnt = 1;
    			}
    			
                tempStr = s.substring(j*i,(j*i)+i);
			}
    		
    		if(cnt == 1) {
    			nowAddStr += tempStr;
			}
			else {
				nowAddStr += cnt + tempStr;
                cnt = 1;
			}

            if(s.length() %i !=0){
            	nowAddStr +=s.substring(s.length()-s.length()%i,s.length());
            }

            answer = answer > nowAddStr.length() ? nowAddStr.length() : answer;
		}
    	
        return answer;
    }

}
