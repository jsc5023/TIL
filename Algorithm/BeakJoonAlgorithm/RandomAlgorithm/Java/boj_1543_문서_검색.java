import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1543_문서_검색 {

    static FastReader scan = new FastReader();
    static String inputStr;
    static String searchStr;
    static int ans;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        inputStr = scan.nextLine();
        searchStr = scan.nextLine();
        ans = 0;
    }

    private static void pro() {

        char[] inputChars = inputStr.toCharArray();
        char[] searchChars = searchStr.toCharArray();

        for(int i = 0; i < inputChars.length - searchChars.length + 1; i++) {

            boolean success = true;

            for(int j = 0; j < searchChars.length; j++) {
                if(inputChars[i + j] != searchChars[j]) {
                    success = false;
                    break;
                }
            }

            if(success) {
                ans++;
                i += searchChars.length - 1;
            }

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
