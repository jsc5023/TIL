import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class boj_15686_치킨배달 {

    static FastReader scan = new FastReader();
    static int N, M;
    static int[][] arr;
    static List<int[]> chickenShops, houses;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        M = scan.nextInt();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = scan.nextInt();
                if(arr[i][j] == 1) {
                    houses.add(new int[]{i, j});
                } else if(arr[i][j] == 2) {
                    chickenShops.add(new int[]{i, j});
                }
            }
        }
    }

    private static void pro() {
        rec_func(0);
    }

    private static void rec_func(int cnt) {
        if(M == cnt) {
        
        }
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
