import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_8595_히든넘버 {

    static FastReader scan = new FastReader();
    static int N;
    static String words;
    static int ans;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        words = scan.next();
    }

    private static void pro() {
        // 연속된 숫자는 한 히든 넘버이다
        // 두 히든 넘버 사이에는 글자가 적어도 한 개 있다.
        // 히든 넘버는 6자리를 넘지 않는다

        boolean isBeforeNumber = false;
        StringBuilder sb = new StringBuilder();

        long ans = 0;

        for(int i = 0; i < words.length(); i++) {
            char nowChar = words.charAt(i);
            if(nowChar >= '0' && nowChar <= '9') {
                sb.append(nowChar);
                isBeforeNumber = true;
            } else {
                if(isBeforeNumber) {
                    ans += Long.parseLong(sb.toString());
                    sb = new StringBuilder();
                    isBeforeNumber = false;
                }
            }
        }

        if(sb.length() > 0) {
            ans += Long.parseLong(sb.toString());
        }

        System.out.println(ans);
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
