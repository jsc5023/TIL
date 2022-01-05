import java.util.HashSet;
import java.util.Set;


public class EnglishWorkRelay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		solution(n, words);
	}

	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        
        String nowWord = "";
        String beforeWord = "";
        
        beforeWord = words[0];
        set.add(words[0]);
        
        int nowRepeat = 1;
        int order = 1;
        for (int i = 1; i < words.length; i++) {

        	order++;
        	
        	nowWord = words[i];
        	
        	if(beforeWord.charAt(beforeWord.length() - 1) != nowWord.charAt(0)) {
        		break;
        	}
        	
        	if(set.contains(nowWord)) {
        		break;
        	}
        	else {
        		set.add(words[i]);
        	}
        	
        	beforeWord = words[i];
        		
        	if(order % n == 0) {
        		order = 0;
        		nowRepeat++;
        	}
        	
        	if(i == words.length - 1) {
        		order = 0;
        		nowRepeat = 0;
        	}
		}
        
        answer[0] = order;
        answer[1] = nowRepeat;
        return answer;
    }
}
