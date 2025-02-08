import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1303_전쟁_전투 {

    static int N, M;
    static boolean[][] isVisited;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {1, -1, 0, 0};
    static char[][] board;
    static boolean[][] visited;
    static FastReader scan = new FastReader();

    public static void main(String[] args) throws IOException {

        N = scan.nextInt();
        M = scan.nextInt();

        board = new char[M][N];
        visited = new boolean[M][N];

        for(int i = 0; i < M; i++) {
            String string = scan.next();
            board[i] = string.toCharArray();
        }

        int[] result = calculatePower();

        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] calculatePower() {

        int totalWhite = 0;
        int totalBlack = 0;

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    int groupSize = dfs(i, j, board[i][j]);
                    if(board[i][j] == 'W') {
                        totalWhite += (groupSize * groupSize);
                    } else {
                        totalBlack += (groupSize * groupSize);
                    }
                }
            }
        }

        return new int[]{totalWhite, totalBlack};
    }

    private static int dfs(int x, int y, char color) {
        int cnt = 1;
        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dirX[i];
            int ny = y + dirY[i];

            if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if(!visited[nx][ny] && board[nx][ny] == color) {
                    cnt += dfs(nx, ny, color);
                }
            }
        }

        return cnt;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
