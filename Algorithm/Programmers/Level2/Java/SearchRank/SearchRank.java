import java.util.ArrayList;
import java.util.List;

public class SearchRank {

	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		solution(info, query);
	}
	
	public static int[] solution(String[] info, String[] query) {
        int[] answer = {};
        
        List<UserInfo> userList = new ArrayList<>();
        
        for (int i = 0; i < info.length; i++) {

        	String[] userinfo = info[i].split(" ");
        	String codingTestProgram = userinfo[0];
        	String jobGroup = userinfo[1];
        	String careerGroup = userinfo[2];
        	String favoritFood = userinfo[3];
        	int score = Integer.parseInt(userinfo[4]);
        	UserInfo user = new UserInfo(codingTestProgram, jobGroup, careerGroup, favoritFood, score);
        	userList.add(user);
        	
		}
        
        for (int i = 0; i < query.length; i++) {
			
        	String[] queryInfo = info[i].split(" and ");
        	// 조건을 검색하는 방법을 어떻게 하면될것인가
        	
		}
        
        
        return answer;
    }
	
	public static class UserInfo{
		String codingTestProgram;
		String jobGroup;
		String careerGroup;
		String favoritFood;
		int score; 
		
		public UserInfo(String codingTestProgram, String jobGroup, String careerGroup, String favoritFood, int score) {
			this.codingTestProgram = codingTestProgram;
			this.jobGroup = jobGroup;
			this.careerGroup = careerGroup;
			this.favoritFood = favoritFood;
			this.score = score;
		}
	}

}
