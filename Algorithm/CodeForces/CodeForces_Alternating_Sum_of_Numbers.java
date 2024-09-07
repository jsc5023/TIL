import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeForces_Alternating_Sum_of_Numbers {

    static FastReader scan = new FastReader();
    static int t;

    public static void main(String[] args) {
        t = scan.nextInt();

        StringBuilder sb = new StringBuilder();

        while(t-- > 0) {
            int n = scan.nextInt();

            int sum = 0;

            for(int i = 1; i <= n; i++) {
                if(i % 2 == 1) {
                    sum += scan.nextInt();
                } else {
                    sum -= scan.nextInt();
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.print(sb.toString());
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
