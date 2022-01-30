import java.util.ArrayList;
import java.util.HashMap;

public class OpenChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.print(solution(record));
	}

	public static String[] solution(String[] record) {
		ArrayList<String> arr = new ArrayList<>();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < record.length; i++) {
			String[] cmd = record[i].split(" ");
			
			if(cmd[0].equals("Enter")) {
				arr.add(cmd[1] + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
				map.put(cmd[1], cmd[2]);
			}
			else if(cmd[0].equals("Change")) {
				map.put(cmd[1], cmd[2]);
			}
			else if(cmd[0].equals("Leave")) {
				arr.add(cmd[1] + "´ÔÀÌ ³ª°¬½À´Ï´Ù.");
			}
		}
		
		String[] answer = new String[arr.size()];
		
		for (int i = 0; i < arr.size(); i++) {
			int idx = arr.get(i).indexOf("´Ô");
			String id = arr.get(i).substring(0, idx);
			String[] tmp = arr.get(i).split(" ");
			answer[i] = map.get(id) + "´ÔÀÌ " + temp[1];
		}
		
		return answer;
    }
}
