import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2480_주사위_세개 {
    static FastReader scan = new FastReader();
    static int A, B, C;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
    }


    private static void pro() {

        int prices = 0;

        if(A == B && B == C) {
            prices = 10000 + (A * 1000);
        } else if(A == B || A == C || B == C) {
            if(A == B || A == C) {
                prices = 1000 + (A * 100);
            } else {
                prices = 1000 + (B * 100);
            }
        } else {
            prices = Math.max(A, Math.max(B, C)) * 100;
        }

        System.out.println(prices);
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
