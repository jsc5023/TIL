import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj_1238_파티 {

    static FastReader scan = new FastReader();
    static int N, M, X;
    static int[] distToX, distFromX;
    static List<Edge>[] edges;
    static List<Edge>[] reverseEdges;
    static int max = 0;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        X = scan.nextInt();

        edges = new ArrayList[N + 1];
        reverseEdges = new ArrayList[N + 1];

        for(int i = 1; i <= N; i++) {
            edges[i] = new ArrayList<>();
            reverseEdges[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            int from = scan.nextInt();
            int to = scan.nextInt();
            int time = scan.nextInt();

            edges[from].add(new Edge(to, time));
            reverseEdges[to].add(new Edge(from, time));
        }
    }

    private static void pro() {
        distFromX = dijkstra(X, edges);
        distToX = dijkstra(X, reverseEdges);

        for(int i = 1; i <= N; i++) {
            max = Math.max(max, distFromX[i] + distToX[i]);
        }

        System.out.print(max);
    }

    private static int[] dijkstra(int start, List<Edge>[] graphs) {
        int[] dist = new int[N + 1];

        for (int i = 1; i <= N ; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        PriorityQueue<Info> pq = new PriorityQueue<>((o1, o2) -> o1.dist - o2.dist);
        dist[start] = 0;
        pq.add(new Info(start, 0));

        while(!pq.isEmpty()) {
            Info info = pq.poll();
            if(dist[info.idx] < info.dist) continue;

            for(Edge e : graphs[info.idx]) {
                if(e.time + dist[info.idx] >= dist[e.to]) continue;
                dist[e.to] = dist[info.idx] + e.time;
                pq.add(new Info(e.to, dist[e.to]));
            }
        }

        return dist;
    }

    static class Info {
        int idx;
        int dist;

        public Info(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }

    static class Edge {
        int to;
        int time;

        public Edge(int to, int time) {
            this.to = to;
            this.time = time;
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
