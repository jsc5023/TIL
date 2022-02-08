
public class SearchRank {

	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		solution(info, query);
	}
	
	public static int[] solution(String[] info, String[] query) {
        int[] answer = {};
        
        for (int i = 0; i < info.length; i++) {
        	String[] userinfo = info[i].split(" ");
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
