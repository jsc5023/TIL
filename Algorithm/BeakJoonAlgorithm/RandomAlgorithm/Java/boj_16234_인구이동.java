import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_16234_인구이동 {

    static FastReader scan = new FastReader();
    static int N, L, R;
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        L = scan.nextInt();
        R = scan.nextInt();

        arr = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
    }

    static int[] dirX = {1, 0, -1, 0};
    static int[] dirY = {0, 1, 0, -1};

    private static void pro() {

        int days = 0;

        while(true) {
            visited = new boolean[N][N];
            boolean isMoved = false;

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(!visited[i][j]) {
                        if(bfs(i, j)) {
                            isMoved = true;
                        }
                    }
                }
            }

            if(!isMoved) {
                break;
            }

            days++;
        }

        System.out.print(days);
    }

    private static boolean bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        List<int[]> union = new ArrayList<>();
        queue.add(new int[]{x, y});
        union.add(new int[]{x, y});
        visited[x][y] = true;

        int sum = arr[x][y]; // 연합의 총 인구 수
        int count = 1; // 연합을 이루는 칸의 개수

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i = 0; i < 4; i++) {
                int nx = curX + dirX[i];
                int ny = curY + dirY[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N)
                    continue;

                if(visited[nx][ny])
                    continue;

                int diff = Math.abs(arr[curX][curY] - arr[nx][ny]);

                if(diff >= L && diff <= R) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                    union.add(new int[]{nx, ny});
                    sum += arr[nx][ny];
                    count++;
                }
            }
        }

        if (count > 1) {
            int newPopulation = sum / count;
            for (int[] pos : union) {
                arr[pos[0]][pos[1]] = newPopulation;
            }
            return true;
        }

        return false;
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
