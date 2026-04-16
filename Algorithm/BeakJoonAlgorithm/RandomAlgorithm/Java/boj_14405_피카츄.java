import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj_14405_피카츄 {

    static FastReader scan = new FastReader();
    static String S;
    static String[] pronunciation = {"pi", "ka", "chu"};

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        S = scan.next();
    }

    private static void pro() {

        boolean canPronunciation = true;

        while(!S.isEmpty()) {

            boolean canWordPronunciation = false;

            for (String s : pronunciation) {
                if (S.startsWith(s)) {
                    canWordPronunciation = true;
                    S = S.substring(s.length());
                    break;
                }
            }

            if(!canWordPronunciation) {
                canPronunciation = false;
                break;
            }
        }

        if(canPronunciation)
            System.out.println("YES");
        else
            System.out.println("NO");
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
