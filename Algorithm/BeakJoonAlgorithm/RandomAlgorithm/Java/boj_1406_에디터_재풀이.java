import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class boj_1406_에디터_재풀이 {
    static FastReader scan = new FastReader();
    static String initWords;
    static int M;
    static Stack<Character> leftWords = new Stack<>();
    static Stack<Character> rightWords = new Stack<>();

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        initWords = scan.next();
        M = scan.nextInt();
    }


    private static void pro() {

        StringBuilder sb = new StringBuilder();

        for (char c : initWords.toCharArray()) {
            leftWords.push(c);
        }

        for (int i = 0; i < M; i++) {
            String cmd = scan.nextLine();

            if(cmd.equals("L")) {
                if(!leftWords.isEmpty()) {
                    rightWords.push(leftWords.pop());
                }
            } else if(cmd.equals("D")) {
                if(!rightWords.isEmpty()) {
                    leftWords.push(rightWords.pop());
                }
            } else if(cmd.equals("B")) {
                if(!leftWords.isEmpty()) {
                    leftWords.pop();
                }
            } else if(cmd.startsWith("P")) {
                String str = cmd.split(" ")[1];
                for (char ch : str.toCharArray()) {
                    leftWords.push(ch);
                }
            }
        }

        for (char ch : leftWords) {
            sb.append(ch);
        }

        while(!rightWords.isEmpty()) {
            sb.append(rightWords.pop());
        }

        System.out.println(sb);
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
