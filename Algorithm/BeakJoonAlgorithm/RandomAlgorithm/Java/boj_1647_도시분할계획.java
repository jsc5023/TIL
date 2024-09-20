import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class boj_1647_도시분할계획 {

    static FastReader scan = new FastReader();
    static int N, M;
    static Road[] roads;
    static int max = 0;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        M = scan.nextInt();

        roads = new Road[M];

        for(int i = 0; i < M; i++) {
            roads[i] = new Road(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
    }

    private static void pro() {
        Node[] nodes = new Node[N + 1];

        for(int i = 1; i <= N; i++) {
            nodes[i] = new Node();
        }

        Arrays.sort(roads, (o1, o2) -> o1.cost - o2.cost);

        int totalCost = 0;

        for(Road road : roads) {
            Node node1 = nodes[road.a];
            Node node2 = nodes[road.b];

            if(node1.isConnected(node2)) continue;
            node1.merge(node2);
            totalCost += road.cost;
            max = Math.max(max, road.cost);
        }

        totalCost -= max;

        System.out.print(totalCost);
    }

    static class Road {
        int a;
        int b;
        int cost;

        public Road(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }
    }

    static class Node {
        int depth = 1;
        Node parent = null;

        boolean isConnected(Node o) {
            return root() == o.root();
        }

        void merge(Node o) {
            if(isConnected(o)) return;

            Node root1 = root();
            Node root2 = o.root();

            if(root1.depth > root2.depth) {
                root2.parent = root1;
            } else if(root1.depth < root2.depth) {
                root1.parent = root2;
            } else {
                root2.parent = root1;
                root1.depth++;
            }
        }

        Node root() {
            if(parent == null) return this;
            return parent.root();
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
