import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_1406_에디터 {

    static FastReader scan = new FastReader();
    static String str;
    static int cursor;
    static Stack<Character> l_stack, r_stack;

    public static void main(String[] args) {
        str = scan.next();

        cursor = str.length() - 1;
        int M = scan.nextInt();

        l_stack = new Stack<>();
        r_stack = new Stack<>();

        char[] chars = str.toCharArray();

        // 왼쪽 스택
        for(char ch : chars) {
            l_stack.add(ch);
        }

        while(M-- > 0) {
            String command = scan.next();

            if(command.equals("L")) {
                if(!l_stack.isEmpty()) {
                    r_stack.add(l_stack.pop());
                }
            } else if(command.equals("D")) {
                if(!r_stack.isEmpty()) {
                    l_stack.add(r_stack.pop());
                }
            } else if(command.equals("B")) {
                if(!l_stack.isEmpty()) {
                    l_stack.pop();
                }
            } else if(command.equals("P")) {
                char[] txt = scan.next().toCharArray();

                for(char ch : txt) {
                    l_stack.add(ch);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : l_stack) {
            sb.append(ch);
        }

        int length = r_stack.size();
        for(int i = 0; i < length; i++) {
            sb.append(r_stack.pop());
        }

        System.out.printf(sb.toString());
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
