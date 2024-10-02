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
    static Jewel[] jewels;
    static long money;

    public static void main(String[] args) {
        input();
        pro();
        System.out.print(money);
    }

    private static void input() {
        N = scan.nextInt();
        K = scan.nextInt();

        jewels = new Jewel[N];

        for(int i = 0; i < N; i++) {
            int weight = scan.nextInt();
            int value = scan.nextInt();
            jewels[i] = new Jewel(weight, value);
        }

        bags = new int[K];

        for(int i = 0; i < K; i++) {
            bags[i] = scan.nextInt();
        }
    }

    private static void pro() {
        Arrays.sort(jewels, (o1, o2) -> o1.weight - o2.weight);

        Arrays.sort(bags);

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);

        int jewelIndex = 0;
        for(int i = 0; i < K; i++) {
            while (jewelIndex < N && jewels[jewelIndex].weight <= bags[i]) {
                pq.add(jewels[jewelIndex].value);
                jewelIndex++;
            }

            if (!pq.isEmpty()) {
                money += pq.poll();
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
