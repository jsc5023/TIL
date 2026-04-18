import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1300_K번째_수 {
    static FastReader scan = new FastReader();
    static int N;
    static long k;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        k = scan.nextLong();
    }

    private static long findKthNumber() {
        long left = 1, right = N * (long) N;
        long ans = 0;

        while(left <= right) {
            long mid = (left + right) / 2L;
            long cnt = 0L;

            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / (long)i, N);
            }

            if (cnt < k) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }

        return ans;
    }


    private static void pro() {
        System.out.println(findKthNumber());
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
