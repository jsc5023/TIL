import java.util.Arrays;

public class PhoneNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		System.out.print(solution(phone_book));
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        for (int i = 1; i < phone_book.length; i++) {
        	if(phone_book[i].startsWith(phone_book[i-1]))
        		return false;
		}
        
        return answer;
    }

}
