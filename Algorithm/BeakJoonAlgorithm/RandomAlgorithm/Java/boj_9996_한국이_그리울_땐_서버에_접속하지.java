import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class boj_9996_한국이_그리울_땐_서버에_접속하지 {

    static FastReader scan = new FastReader();
    static int N;
    static String[] pattern;
    static String[] files;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        pattern = scan.next().split("\\*");
        files = new String[N];

        for(int i = 0; i < N; i++) {
            files[i] = scan.next();
        }
    }

    private static void pro() {

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < N; i++) {
            stringBuilder.append(patternCheck(files[i])).append("\n");
        }

        System.out.println(stringBuilder);
    }

    private static String patternCheck(String file) {

        if(file.length() < pattern[0].length() + pattern[1].length())
            return "NE";

        if(!file.startsWith(pattern[0]))
            return "NE";

        if(!file.endsWith(pattern[1]))
            return "NE";

        return "DA";
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
