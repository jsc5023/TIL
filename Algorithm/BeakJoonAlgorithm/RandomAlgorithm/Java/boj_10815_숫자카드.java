import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class boj_10815_숫자카드 {
    static FastReader scan = new FastReader();
    static int N, M;
    static int[] cards, numbers;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();

        cards = new int[N];

        for(int i = 0; i < N; i++) {
            cards[i] = scan.nextInt();
        }

        M = scan.nextInt();

        numbers = new int[M];

        for (int i = 0; i < M; i++) {
            numbers[i] = scan.nextInt();
        }
    }


    private static void pro() {

        HashSet<Integer> cardSet = new HashSet<>();

        Arrays.stream(cards).forEach(cardSet::add);

        String ans = Arrays.stream(numbers).mapToObj(num -> cardSet.contains(num) ? "1" : "0").collect(Collectors.joining(" "));

        System.out.println(ans);
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
