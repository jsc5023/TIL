import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static FastReader scan = new FastReader();
    static int t;
    static int n;

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        t = scan.nextInt();

        while(t-- > 0) {
            n = scan.nextInt();

            int ans = 0;
            int[] pairs = new int[n];

            for(int i = 0; i < n; i++) {
                int input = scan.nextInt();
                pairs[i] = input;
            }

            Arrays.sort(pairs);

            for(int i = 0; i < pairs.length - 1; i += 2) {
                ans = Math.max(ans, Math.abs(pairs[i + 1] - pairs[i]));
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb);
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}