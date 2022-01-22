
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

        // ���ͽ�Ʈ�� �˰��� ����Ǯ��
        // https://geehye.github.io/programmers-ets-01/# ����
        int[][] arr = new int[N+1][N+1];
        
        for (int i = 1; i < N; i++) {
			for (int j = 1; j < N; j++) {
				if(i == j)
					arr[i][j] = 0;
				else
					arr[i][j] = 500000;
			}
		}
        // ������� ����������, 
        
        for (int i = 0; i < road.length; i++)  {
        	if(arr[road[i][0]][road[i][1]] > road[i][2])
        		continue;// �� �ð��� ���Ե�� ��� ���ߵǱ� ������, �� ū���� �ʿ����
        	
        	arr[road[i][0]][road[i][1]] = road[i][2];
        	arr[road[i][1]][road[i][0]] = road[i][2];
        }
//        
//        /* ��������� ���������� �ɸ��� �ּ� �ð� ���ϱ� */
        for (int x = 1; x <= N; x++) {
            for (int y = 1; y <= N; y++) {
                for (int z = 1; z <= N; z++) {
                    if (y == z) continue; // ������� �������� ������ �ɸ��� �ð��� 0 (�̹� �ּڰ�)
                    
                    if (arr[y][z] > arr[y][x] + arr[x][z])
                        arr[y][z] = arr[y][x] + arr[x][z];
                }
            }
        }
//        
        for (int i = 1; i <= N; i++) {
            if (arr[1][i] <= K) answer++;
        }
        
        return answer;
    }

}
