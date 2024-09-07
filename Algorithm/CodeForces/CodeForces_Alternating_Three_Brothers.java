import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CodeForces_Alternating_Three_Brothers {

    static FastReader scan = new FastReader();
    static int t;

    public static void main(String[] args) {
        int a = scan.nextInt();
        int b = scan.nextInt();

        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);

        for(int i = 1; i <= 3; i++) {
            if(!set.contains(i)) {
                System.out.print(i);
                return;
            }
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
