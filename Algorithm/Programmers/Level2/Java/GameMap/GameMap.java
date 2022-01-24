
public class GameMap {

	static int[] dx = {-1, 1, 0, 1}; // 상하좌우
	static int[] dy = {0, 0, -1, 1}; // 상하좌우
	static boolean[][] visited;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		System.out.print(solution(maps));
	}

	public static int solution(int[][] maps) {
		// bfs 또는 dfs로 풀어야되는문제
		
        int answer = -1;
        dfs(0, 0, maps);

        return answer;
    }
	
	public static int dfs(int x, int y, int[][] maps) {
		
		int xLength = maps.length;
		int yLength = maps[0].length;
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX >= 0 && nextY >= 0 && nextX < xLength  && nextY < yLength)
				maps[]
		}
		return 1;
	}
}
