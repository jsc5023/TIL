import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj_2493_탑 {

    static FastReader scan = new FastReader();
    static int N;
    static int[] lasers, answers;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        lasers = new int[N];
        answers = new int[N];

        for(int i = 0; i < N; i++) {
            lasers[i] = scan.nextInt();
        }
    }

    private static void pro() {
        PriorityQueue<Top> heap = new PriorityQueue<>((o1, o2) -> {
            if(o1.height == o2.height) {
                return o2.cnt - o1.cnt;
            }

            return o1.height - o2.height;
        });

        heap.add(new Top(lasers[N - 1], N - 1));

        for(int i = N - 2; i>=0; i--) {

            while(!heap.isEmpty() && heap.peek().height <= lasers[i]) {
                Top curTop = heap.poll();
                answers[curTop.cnt] = i + 1;
            }

            heap.add(new Top(lasers[i], i));
        }

        StringBuilder sb = new StringBuilder();
        for(int cnt : answers) {
            sb.append(cnt).append(" ");
        }

        System.out.print(sb.toString());
    }

    public static class Top {
        int height;
        int cnt;

        public Top(int height, int cnt) {
            this.height = height;
            this.cnt = cnt;
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
