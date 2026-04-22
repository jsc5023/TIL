import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class boj_2839_설탕_배달 {
    static FastReader scan = new FastReader();
    static int N;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
    }


    private static void pro() {

        int sugarBoxes = 0;

        while(N > 0) {
            if(N % 5 == 0) {
                sugarBoxes += (N / 5);
                N = 0;
                break;
            }
            sugarBoxes++;
            N -= 3;
        }

        if(N != 0) {
            sugarBoxes = -1; // 불가능 -1
        }

        System.out.println(sugarBoxes);
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
