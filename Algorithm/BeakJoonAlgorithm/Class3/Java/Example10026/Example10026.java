import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Example10026 {

	static char[][] color;
	static boolean[][] visited;
	static int N;
	
	static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
     
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		color = new char[N+1][N+1];
		visited = new boolean[N+1][N+1];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				color[i][j] = s.charAt(j);
			}
		}

		int cnt = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (!visited[i][j])
                {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        
        int normal_cnt = cnt;
        cnt = 0;
        visited = new boolean[N + 1][N + 1];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (color[i][j] == 'G')
                {
                    color[i][j] = 'R';
                }
            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (!visited[i][j])
                {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        int abnormal_cnt = cnt;
        System.out.print(normal_cnt + " " + abnormal_cnt);
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		char temp_char = color[x][y];
		
		for (int i = 0; i < 4; i++) {
			int new_x = x + dx[i];
			int new_y = y + dy[i];
			
			if(new_x < 0 || new_y < 0 || new_x > N || new_y > N)
				continue;
			
			  if (!visited[new_x][new_y] && color[new_x][new_y] == temp_char)
              {
                  dfs(new_x, new_y);
              }
		}
		
	}

}
