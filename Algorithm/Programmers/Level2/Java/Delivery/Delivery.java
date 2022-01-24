
public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 5;
		int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
		int K = 3;
		System.out.print(solution(N, road, K));
	}
	
	public static int solution(int N, int[][] road, int K) {
        int answer = 0;

        // 다익스트라 알고리즘 문제풀이
        // https://geehye.github.io/programmers-ets-01/# 참조
        int[][] arr = new int[N+1][N+1];
        
        for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if(i == j)
					arr[i][j] = 0;
				else
					arr[i][j] = 500001;
			}
		}
        // 여기까진 쉽게이해함, 
        
        for (int i = 0; i < road.length; i++)  {
        	if(arr[road[i][0]][road[i][1]] < road[i][2])
        		continue;// 더 시간이 적게드는 길로 가야되기 때문에, 더 큰값은 필요없음
        	
        	arr[road[i][0]][road[i][1]] = road[i][2];
        	arr[road[i][1]][road[i][0]] = road[i][2];
        }
        
        for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (int j2 = 1; j2 <= N; j2++) {
					if(j2 == j)
						continue;
					
					if(arr[j][j2] > arr[j][i] + arr[i][j2])
						arr[j][j2] = arr[j][i] + arr[i][j2];
				}
			}
		}

        for (int i = 1; i <= N; i++) {
            if (arr[1][i] <= K)
            	answer++;
        }
        
        return answer;
    }

}
