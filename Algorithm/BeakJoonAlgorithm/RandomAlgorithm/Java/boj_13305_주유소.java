import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_13305_주유소 {

    static FastReader scan = new FastReader();
    static int N;
    static long[] lengths;
    static long[] oilPrices;
    static long[] dp;
    static long minOilPrice = Long.MAX_VALUE;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        lengths = new long[N - 1];
        oilPrices = new long[N];
        dp = new long[N + 1];

        for(int i = 0; i < N - 1; i++) {
            lengths[i] = scan.nextInt();
        }

        for(int i = 0; i < N; i++) {
            oilPrices[i] = scan.nextInt();
        }
    }

    private static void pro() {
        minOilPrice = oilPrices[0];
        dp[1] = minOilPrice * lengths[0];

        for(int i = 1; i < N - 1; i++) {
            minOilPrice = Math.min(oilPrices[i], minOilPrice);
            dp[i + 1] = dp[i] + (minOilPrice * lengths[i]);
        }

        System.out.println(dp[N - 1]);
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
