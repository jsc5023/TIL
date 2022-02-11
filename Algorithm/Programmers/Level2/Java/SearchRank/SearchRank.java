import java.util.ArrayList;
import java.util.List;

public class SearchRank {

	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		solution(info, query);
	}
	
	public static int[] solution(String[] info, String[] query) {
       
		// 풀이 변경(이분탐색으로 풀어야합니다.)
		
		//Binary Search
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
        
        int[] answer = new int[query.length];
        
        
        for (int i = 0; i < query.length; i++) {
        	String[] queryInfo = query[i].split(" and ");
        	String codingTestProgram = queryInfo[0];
        	String jobGroup = queryInfo[1];
        	String careerGroup = queryInfo[2];
        	String[] favoritFood_Score = queryInfo[3].split(" ");
        	String favoritFood = favoritFood_Score[0];
        	int score = Integer.parseInt(favoritFood_Score[1]);
        	int index = 0;
        	for (UserInfo user : userList) {
				if((codingTestProgram.equals("-") || user.codingTestProgram.equals(codingTestProgram))
						&& (jobGroup.equals("-") || user.jobGroup.equals(jobGroup))
						&& (careerGroup.equals("-") || user.careerGroup.equals(careerGroup))
						&& (favoritFood.equals("-") || user.favoritFood.equals(favoritFood))
						&& (user.score >= score)) {
					index++;
				}
			}
        	answer[i] = index;
		}
        
        
        return answer;
    }
	
	static int binarySearch(String query, int score)
    {
        if(!map.containsKey(query)) return 0;
        ArrayList<Integer> tmpList = map.get(query);
        int start = 0, end = tmpList.size()-1;
        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(score > tmpList.get(mid)) start = mid + 1;
            else end = mid - 1;
        }
        return tmpList.size() - start;
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
