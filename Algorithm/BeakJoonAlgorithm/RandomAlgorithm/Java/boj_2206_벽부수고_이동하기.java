import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_2206_벽부수고_이동하기 {

    static FastReader scan = new FastReader();
    static int N, M;
    static int[][] list;
    static int[][][] visitedCnt;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        M = scan.nextInt();

        list = new int[N + 1][M + 1];

        for(int i = 1; i <= N; i++) {
            char[] chars = scan.next().toCharArray();

            for(int j = 0; j < chars.length; j++) {
                list[i][j + 1] = (int)(chars[j] - '0');
            }
        }
    }

    private static void pro() {

        visitedCnt = new int[N + 1][M + 1][2];
        bfs();
    }

    static int[] dirX = {0, 1, 0, -1};
    static int[] dirY = {1, 0, -1, 0};

    private static void bfs() {

        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(1, 1, 1, 0));
        visitedCnt[1][1][0] = 1;

        while(!queue.isEmpty()) {
            Position curPosition = queue.poll();

            if(curPosition.x == N && curPosition.y == M) {
                System.out.println(curPosition.cnt);
                return;
            }

            for(int i = 0; i < 4; i++) {
                int nx = curPosition.x + dirX[i];
                int ny = curPosition.y + dirY[i];

                if(nx <= 0 || ny <= 0 || nx > N || ny > M) {
                    continue;
                }

                // 벽을 부수지 않고 이동할 경우
                if(list[nx][ny] == 0 && visitedCnt[nx][ny][curPosition.visited] == 0) {
                    visitedCnt[nx][ny][curPosition.visited] = curPosition.cnt + 1;
                    queue.add(new Position(nx, ny, curPosition.cnt + 1, curPosition.visited));
                }

                // 벽을 부수고 이동할 경우
                if(list[nx][ny] == 1 && curPosition.visited == 0 && visitedCnt[nx][ny][1] == 0) {
                    visitedCnt[nx][ny][1] = curPosition.cnt + 1;
                    queue.add(new Position(nx, ny, curPosition.cnt + 1, 1));
                }
            }
        }

        // 모든 경우를 다 탐색했는데도 도착지에 도달하지 못한 경우
        System.out.println(-1);
    }

    static class Position {
        public int x;
        public int y;
        public int cnt;
        public int visited;

        public Position(int x, int y, int cnt, int visited){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.visited = visited;
        }
    }


    static class FastReader{
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