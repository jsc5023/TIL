import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj_1655_가운데를말해요 {

    static int N;
    static FastReader scan = new FastReader();

    public static void main(String[] args) {
        N = scan.nextInt();

        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        while(N-- > 0) {
            int num = scan.nextInt();

            if(maxHeap.size() == minHeap.size()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            if(!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                int maxHeapLoop = maxHeap.poll();
                int minHeapLoop = minHeap.poll();

                maxHeap.offer(minHeapLoop);
                minHeap.offer(maxHeapLoop);
            }

            sb.append(maxHeap.peek()).append("\n");
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
