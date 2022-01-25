import java.util.LinkedList;
import java.util.Queue;

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
        int answer = -1;
        // bfs 문제풀이
        visited = new boolean[maps.length][maps[0].length];
        bfs(0, 0, maps);

        return answer;
    }
	
	public static int bfs(int x, int y, int[][] maps) {
		Queue<Position> queue = new LinkedList<>();
		queue.offer(new Position(x, y, 1));
		
		int xMaxLength = maps.length - 1;
		int yMaxLength = maps[0].length - 1;
		
		while(!queue.isEmpty()) {
			Position now = queue.poll();
			
			if(now.x == xMaxLength && now.y == yMaxLength)
				return now.cnt;
				
			for (int i = 0; i < 4; i++) {
				int nextX = x + dx[i];
				int nextY = y + dy[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX <= xMaxLength  && nextY <= yMaxLength) {
					if(maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
						visited[nextX][nextY] = true;
						queue.offer(new Position(nextX, nextY, now.cnt));
					}
				}
			}
		}
		
		return -1;
	}
	
	public static class Position{
		int x;
		int y;
		int cnt;
		
		public Position(int x, int y, int cnt) {
			this.x = x;
            this.y = y;
            this.cnt = cnt;
		}
	}
}
