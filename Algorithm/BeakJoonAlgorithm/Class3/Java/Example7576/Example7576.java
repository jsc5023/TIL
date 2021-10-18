import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Example7576 {

	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bfs(arr, M, N);
	}
	
	public static void bfs(int[][] arr, int M, int N) {
		Queue<TomatoLocation> queue = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(arr[i][j] == 1)
					queue.offer(new TomatoLocation(j, i));
			}
		}
		
		while(!queue.isEmpty()) {
			TomatoLocation tomatoLocation = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nextY = tomatoLocation.y + dy[i];
				int nextX = tomatoLocation.x + dx[i];
				
				if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= M)
					continue;
				
				if(arr[nextY][nextX] != 0)
					continue;
				
				arr[nextY][nextX] = arr[tomatoLocation.y][tomatoLocation.x] + 1;
				queue.offer(new TomatoLocation(nextX, nextY));
			}
		}
		
		int max = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if (arr[i][j] == 0)
                {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max - 1);
	}
}

class TomatoLocation{
	int x;
	int y;
	
	public TomatoLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
}
