import java.util.HashSet;

public class OpenChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.print(solution(record));
	}

	public static String[] solution(String[] record) {
        String[] answer = {};
        
        // 문제 접근법
        // Enter를 Replace한후, Hash에 저장, 그값을 변경한다.
        Set<String> set = new HashSet<>();
        for (int i = 0; i < record.length; i++) {
        	
		}
        return answer;
    }
}
