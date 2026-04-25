import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_9935_문자열_폭발 {
    static FastReader scan = new FastReader();
    static String s, boom;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        s = scan.next();
        boom = scan.next();
    }


    private static void pro() {

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if(stack.size() >= boom.length()) {
                boolean isBoom = true;

                for(int j = 0; j < boom.length(); j++) {
                    if(stack.get(stack.size() - boom.length() + j) != boom.charAt(j)) {
                        isBoom = false;
                        break;
                    }
                }

                if(isBoom) {
                    for(int j = 0; j < boom.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            sb.append("FRULA");
        } else {
            for(int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
            }
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
