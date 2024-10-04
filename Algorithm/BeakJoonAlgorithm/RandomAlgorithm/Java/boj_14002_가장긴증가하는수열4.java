import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class boj_14002_가장긴증가하는수열4 {

    static FastReader scan = new FastReader();
    static int N;
    static int[] arr;
    static List<Integer>[] dp;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        arr = new int[N];
        dp = new LinkedList[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
            dp[i] = new LinkedList<>();
            dp[i].add(arr[i]);
        }
    }

    private static void pro() {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i].size() < dp[j].size() + 1) {
                    dp[i] = new LinkedList<>(dp[j]);
                    dp[i].add(arr[i]);
                }
            }
        }

        List<Integer> lis = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            if(lis.size() < dp[i].size()) {
                lis = dp[i];
            }
        }

        System.out.println(lis.size());
        for (int num : lis) {
            System.out.print(num + " ");
        }
        System.out.println();
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
