import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforces_C2_Message_Transmission_Error {

    static FastReader scan = new FastReader();

    public static void main(String[] args) {
        String str = scan.next();

        char[] chars = str.toCharArray();
        StringBuilder curSb = new StringBuilder();

        boolean isError = false;

        for(int i = 0; i < chars.length / 2; i++) {
            char left = chars[(chars.length / 2) - i];
            char right = chars[chars.length - 1 - i];

            if(right != left) {
                isError = true;
                break;
            }

            curSb.append(left);
        }

        StringBuilder sb = new StringBuilder();

        if(isError) {
            sb.append("NO");
        } else{
            if(sb.length() == chars.length / 2) {
                sb.append("NO");
            } else {
                sb.append("YES").append("\n");
                sb.append(curSb.reverse());
                for(int i = 0; i < chars.length / 2 - curSb.length(); i++) {
                    sb.insert(i, chars[i]);
                }
            }
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
