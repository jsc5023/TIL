import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_2696_중앙값구하기 {

    static FastReader scan = new FastReader();
    static int T;

    public static void main(String[] args) {
        T = scan.nextInt();

        StringBuilder sb = new StringBuilder();

        while(T-- > 0) {
            int M = scan.nextInt();

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            List<Integer> list = new ArrayList<>();

            for(int i = 1; i <= M; i++) {
                int num = scan.nextInt();

                if(maxHeap.size() == minHeap.size()) {
                    maxHeap.add(num);
                } else {
                    minHeap.add(num);
                }

                if(!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                    int maxHeapLoop = maxHeap.poll();
                    int minHeapLoop = minHeap.poll();
                    maxHeap.offer(minHeapLoop);
                    minHeap.offer(maxHeapLoop);
                }

                if(i % 2 == 1) {
                    list.add(maxHeap.peek());
                }
            }

            sb.append(list.size()).append("\n");
            int cnt = 0;

            for (int val : list) {

                if(cnt != 0 && cnt % 10 == 0) {
                    sb.append("\n");
                }
                sb.append(val).append(" ");
                cnt++;
            }
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
