import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1654_랜선_자르기 {
    static FastReader scan = new FastReader();
    static int K, N;
    static long[] cables;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        K = scan.nextInt();
        N = scan.nextInt();

        cables = new long[K];

        for (int i = 0; i < K; i++) {
            cables[i] = scan.nextLong();
        }

        System.out.println(findMaxLine());
    }

    private static long findMaxLine() {

        long start = 1;
        long end = Arrays.stream(cables).max().orElse(0L);

        while(start <= end) {
            long mid = (start + end)/ 2L;

            long cnt = 0L;
            for(long cable : cables) {
                cnt += cable / mid;
            }

            if(cnt >= N) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }


    private static void pro() {


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

        long nextLong() { return Long.parseLong(next()); }

    }
}
