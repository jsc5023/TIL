import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj_11725_트리의_부모_찾기 {

    static FastReader scan = new FastReader();
    static int N;
    static List<Integer>[] adj;
    static int[] ans;
    static boolean[] visited;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        adj = new ArrayList[N + 1];
        ans = new int[N + 1];
        visited = new boolean[N + 1];

        for(int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    private static void pro() {

        for(int i = 1; i < N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            adj[x].add(y);
            adj[y].add(x);
        }

        dfs(1);

        for(int i = 2; i <= N; i++) {
            System.out.println(ans[i]);
        }
    }

    private static void dfs(int node) {

        for(int v : adj[node]) {
            if(ans[v] == 0) {
                ans[v] = node;
                dfs(v);
            }
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
