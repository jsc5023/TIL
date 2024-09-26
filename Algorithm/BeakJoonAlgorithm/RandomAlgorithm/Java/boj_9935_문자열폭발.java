import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_9935_문자열폭발 {

    static FastReader scan = new FastReader();
    static String str, boom;
    static Stack<Character> stack;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        str = scan.next();
        boom = scan.next();
    }

    private static void pro() {

        stack = new Stack<>();

        int boomLength = boom.length();

        for(int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));

            if (stack.size() >= boomLength) {
                boolean isMatch = true;

                for(int j = 0; j < boomLength; j++) {
                    if(stack.get(stack.size() - boomLength + j) != boom.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }

                if(isMatch) {
                    for(int j = 0; j < boomLength; j++) {
                        stack.pop();
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        if(stack.isEmpty()) {
            sb.append("FRULA");
        } else {
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            sb.reverse();
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
