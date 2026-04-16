import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj_1316_그룹_단어_체커 {

    static FastReader scan = new FastReader();
    static int N;
    static String[] words;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();

        words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = scan.next();
        }
    }

    private static void pro() {

        int ans = 0;

        for (String word: words) {
            Set<Character> set = new HashSet<>();
            char beforeCh = ' ';
            boolean isGroupWord = true;

            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if(beforeCh != ch) {
                    if(!set.contains(ch))
                        set.add(ch);
                    else {
                        isGroupWord = false;
                        break;
                    }
                }
                beforeCh = ch;
            }

            if(isGroupWord)
                ans++;
        }

        System.out.print(ans);
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
