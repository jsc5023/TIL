import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Example2178 {

	static int N;
	static int M;
	static int[][] map;
	static boolean[][] visit;
	static int[] dy = {1, -1, 0, 0}; // »óÇÏÁÂ¿ì
	static int[] dx = {0, 0, -1, 1}; // »óÇÏÁÂ¿ì
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visit = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j) - '0';
				visit[i][j] = false;
			}
		}
		
		visit[0][0] = true;
		findMap(0, 0);
		System.out.print(map[N-1][M - 1]);
	}
	
	public static void findMap(int y, int x) {
		
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {y, x});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int nowY = now[0];
			int nowX = now[1];
			
			for (int i = 0; i < 4; i++) {
				
				int nextY = nowY + dy[i];
				int nextX = nowX + dx[i];
				
				if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= M)
					continue;
				
				if(visit[nextY][nextX] || map[nextY][nextX] == 0)
					continue;
				
				queue.offer(new int[] {nextY, nextX});
				map[nextY][nextX] = map[nowY][nowX] + 1;
				visit[nextY][nextX] = true;
			}
		}
		
		
	}

}
