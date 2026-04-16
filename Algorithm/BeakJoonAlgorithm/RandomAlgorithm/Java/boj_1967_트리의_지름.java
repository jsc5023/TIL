import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class boj_1967_트리의_지름 {

    static FastReader scan = new FastReader();
    static int N;
    static List<Node>[] adj;
    static boolean[] visited;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        adj = new ArrayList[N + 1];

        for(int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    private static void pro() {

        for(int i = 1; i < N; i++) {
            int parent = scan.nextInt();
            int child = scan.nextInt();
            int dist = scan.nextInt();

            adj[parent].add(new Node(child, dist));
            adj[child].add(new Node(parent, dist));
        }

        NodeDiameter nodeDiameter1 = farthestFrom(1);
        NodeDiameter nodeDiameter2 = farthestFrom(nodeDiameter1.node);
        System.out.println(nodeDiameter2.diameter);
    }

    static NodeDiameter farthestFrom(int start) {
        visited = new boolean[N + 1];
        visited[start] = true;
        return dfs(start, 0);
    }

    private static NodeDiameter dfs(int nodeNum, int dist) {

        NodeDiameter best = new NodeDiameter(nodeNum, dist);

        for(Node node : adj[nodeNum]) {
            if(!visited[node.next]) {
                visited[node.next] = true;
                NodeDiameter candidate = dfs(node.next, dist + node.dist);
                if(candidate.diameter > best.diameter) best = candidate;
            }
        }

        return best;
    }

    public static class Node {
        int next;
        int dist;

        public Node(int next, int dist) {
            this.next = next;
            this.dist = dist;
        }
    }

    public static class NodeDiameter {
        int node;
        int diameter;

        public NodeDiameter(int node, int diameter) {
            this.node = node;
            this.diameter = diameter;
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
