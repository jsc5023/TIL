import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj_15686_치킨배달 {

    static FastReader scan = new FastReader();
    static int N, M;
    static int[][] arr;
    static List<int[]> chickenShops = new ArrayList<>();
    static List<int[]> houses = new ArrayList<>();
    static int minChickenDistance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        N = scan.nextInt();
        M = scan.nextInt();

        arr = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = scan.nextInt();
                if(arr[i][j] == 1) {
                    houses.add(new int[]{i, j});
                } else if(arr[i][j] == 2) {
                    chickenShops.add(new int[]{i, j});
                }
            }
        }
    }

    private static void pro() {
        combination(new ArrayList<>(), 0, 0);
        System.out.print(minChickenDistance);
    }

    private static void combination(List<int[]> selected, int start, int depth) {
        if(depth == M) {

            int cityChickenDistance = calculateChickenDistance(selected);
            minChickenDistance = Math.min(minChickenDistance, cityChickenDistance);
            return;
        }

        for(int i = start; i < chickenShops.size(); i++) {
            selected.add(chickenShops.get(i));
            combination(selected, i + 1, depth + 1);
            selected.remove(selected.size() - 1);
        }
    }

    private static int calculateChickenDistance(List<int[]> selected) {
        int totalDistance = 0;

        for(int[] house : houses) {
            int minDistance = Integer.MAX_VALUE;
            for(int[] chickenShop : selected) {
                int distance = Math.abs(house[0] - chickenShop[0]) + Math.abs(house[1] - chickenShop[1]);
                minDistance = Math.min(minDistance, distance);
            }
            totalDistance += minDistance;
        }

        return totalDistance;
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
