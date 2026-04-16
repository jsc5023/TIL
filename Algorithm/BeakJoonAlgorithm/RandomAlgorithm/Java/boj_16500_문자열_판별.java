import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_16500_문자열_판별 {

    static FastReader scan = new FastReader();
    static String S;
    static int N;
    static Set<String> set;

    public static void main(String[] args) {
        input();
        pro();
    }


    private static void input() {
        S = scan.next();
        N = scan.nextInt();
        set = new HashSet<>();

        for(int i = 0; i < N; i++) {
            String s = scan.next();
            set.add(s);
        }
    }

    private static void pro() {

        int i = 0;
        int n = S.length();

        boolean canMakeS = true;

        while(i < n) {

            boolean existsStartsWord = false;

            for(String word : set) {
                if(i + word.length() <= n && S.startsWith(word, i)) {
                    existsStartsWord = true;
                    i += word.length();
                    break;
                }
            }

            if(!existsStartsWord) {
                canMakeS = false;
                break;


            }
        }

        if(canMakeS)
            System.out.println(1);
        else
            System.out.println(0);
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
