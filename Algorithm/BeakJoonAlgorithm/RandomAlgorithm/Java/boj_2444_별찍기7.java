import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2444_별찍기7 {

    static FastReader scan = new FastReader();

    public static void main(String[] args) {
        int N = scan.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = N - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                sb.append(" ");
            }

            int val = N - i;

            for(int j = 1; j < 2 * val; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        for(int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++) {
                sb.append(" ");
            }

            int val = 2 * (N - i);

            for(int j = 1; j < val; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.print(sb);
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
