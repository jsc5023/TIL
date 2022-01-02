
public class Fatigue_Level {

	static int nowFatigue;
	static int answer = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		System.out.print(solution(k, dungeons));
	}
	
	public static int solution(int k, int[][] dungeons) {
        nowFatigue = k;
        
        // dfs 로 문제를 풀어야됩니다.(경로를 찾아야되므로)
        dfs(k, dungeons, new boolean[dungeons.length], 0);
        
        return answer;
    }
	
	 public static void dfs(int k, int[][] dungeons, boolean[] visit, int count) {
        if(count>=visit.length) {
            answer = count;
            return;
        }
        for(int i=0 ; i<dungeons.length ; i++) {
            if(visit[i]) continue;
            if(k<dungeons[i][0]) {
            	answer = Math.max(answer, count);
                continue;
            }
            visit[i] = true;
            dfs(k-dungeons[i][1], dungeons, visit, count+1);
            visit[i] = false;
        }
        return;
    }

}
