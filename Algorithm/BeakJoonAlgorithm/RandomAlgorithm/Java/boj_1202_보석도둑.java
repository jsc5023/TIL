import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj_1202_보석도둑 {

    static FastReader scan = new FastReader();
    static int N, K;
    static int[] weights, values, bags;
    static PriorityQueue<Jewel> jewels;
    static int money;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        K = scan.nextInt();

        jewels = new PriorityQueue<>((o1, o2) -> {
            if(o1.value != o2.value) {
                return o2.value - o1.value;
            }

            return o2.weight - o1.weight;
        });

        for(int i = 0; i < N; i++) {
            int weight = scan.nextInt();
            int value = scan.nextInt();
            jewels.add(new Jewel(weight, value));
        }

        bags = new int[K];

        for(int i = 0; i < K; i++) {
            bags[i] = scan.nextInt();
        }
    }

    private static void pro() {
        Arrays.sort(bags);

        for(int i = bags.length - 1; i >= 0; i--) {
            while(!jewels.isEmpty()) {
                Jewel jewel = jewels.peek();

                if(bags[i] < jewel.weight) {

                }
            }
        }
    }

    static class Jewel {
        int weight;
        int value;

        public Jewel(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
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
