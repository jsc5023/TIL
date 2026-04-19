import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_8595_히든넘버_다른풀이 {
    static FastReader scan = new FastReader();
    static int n;
    static String s;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        n = scan.nextInt();
        s = scan.next();
    }

    private static void pro() {
        long totalSum = 0;
        long curNum = 0;

        for(char c: s.toCharArray()) {
            if(Character.isDigit(c)) {
                curNum = (curNum * 10) + (c - '0');
            } else {
                totalSum += curNum;
                curNum = 0;
            }
        }

        System.out.println(totalSum);
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
