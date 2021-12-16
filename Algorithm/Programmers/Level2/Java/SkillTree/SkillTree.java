import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBDK";
		
		String[] skill_trees = {"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"};
		
		System.out.print(solution(skill, skill_trees));
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] charskill = skill.toCharArray();

        for (int i = 0; i < skill_trees.length; i++) {
        	
        	Queue<Character> queue = new LinkedList<>(); // queue를 그때그때 초기화를 시켜줘야 합니다.
        	 
			char[] chars = skill_trees[i].toCharArray();
			
			for (int j = 0; j < charskill.length; j++) {
	        	queue.add(charskill[j]);
			}
			
			boolean check = true;
			
			for (int j = 0; j < chars.length; j++) {
				if(queue.contains(chars[j])){
					if(queue.peek() == chars[j]) {
						queue.poll();
					}
					else {
						check = false;
						break;
					}
				}
			}
			
			if(check == true)
				answer++;
		}
        
        return answer;
    }
}
