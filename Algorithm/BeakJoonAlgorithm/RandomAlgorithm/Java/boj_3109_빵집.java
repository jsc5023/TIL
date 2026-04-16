import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class boj_3109_빵집 {

    static FastReader sc = new FastReader();
    static int R, C;
    static char[][] boards;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        R = sc.nextInt();
        C = sc.nextInt();

        boards = new char[R][C];

        for(int i = 0; i < R; i ++) {
            String pipe = sc.next();
            boards[i] = pipe.toCharArray();
        }
    }

    private static void pro() {
        System.out.println(installPipes());
    }

    private static int installPipes() {
        int totalPipes = 0;

        for(int i = 0; i < R; i++) {
            if(boards[i][0] == '.') {
                if(dfs(i, 0)) totalPipes++;
            }
        }

        return totalPipes;
    }

    private static boolean dfs(int row, int col) {
        if(col == C - 1) {
            return true;
        }

        for(int dx : new int[]{-1, 0, 1}) {
            int nextRow = row + dx;
            int nextCol = col + 1;

            if(nextRow >= 0 && nextRow < R && boards[nextRow][nextCol] == '.') {
                boards[nextRow][nextCol] = 'x';
                if(dfs(nextRow, nextCol)) {
                    return true;
                }
            }
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
