
public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbaccc";
		System.out.print(solution(s));
	}
	
    public static int solution(String s) {
    	
    	int answer = 0;
    	
    	// 핵심은 subString을 나눠서 풀어야됩니다.
    	// 우선 인터넷 참조로 풉니다.(계속틀림)
    	if(s.length() == 1)
    		return 1;
    	
    	// 나눠서 압축할려면 아무리 커도 절반입니다.
    	for (int i = 0; i < s.length() / 2; i++) {
			String str = "";
			String temp = "";
			int cnt = 1;
			
		}
    	
      
            
        return answer;
    }

}
