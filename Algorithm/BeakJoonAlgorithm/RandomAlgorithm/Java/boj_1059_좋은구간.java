import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;

public class boj_1059_좋은구간 {

    static FastReader scan = new FastReader();
    static int L, n;
    static int[] arr;
    static int length = 0;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        L = scan.nextInt();

        arr = new int[L];

        for(int i = 0; i < L; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        n = scan.nextInt();
    }


    private static void pro() {

        int startNum = 1;
        int endNum = 1000;

        for (int i = 0; i < L; i++) {
            if (arr[i] == n) {
                System.out.println(0);
                return;
            } else if (arr[i] > n) {
                endNum = arr[i] - 1;
                break;
            } else {
                startNum = arr[i] + 1;
            }
        }

        int count = (n - startNum + 1) * (endNum - n + 1) - 1;
        System.out.println(count);
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
