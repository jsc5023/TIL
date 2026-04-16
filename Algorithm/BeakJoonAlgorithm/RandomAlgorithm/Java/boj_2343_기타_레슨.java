import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_2343_기타_레슨 {

    static FastReader scan = new FastReader();
    static int N, M;
    static int[] lessons;

    public static void main(String[] args) {
        N = scan.nextInt();
        M = scan.nextInt();
        lessons = new int[N];

        for(int i = 0; i < lessons.length; i++) {
            lessons[i] = scan.nextInt();
        }

        System.out.println(minSize());
    }

    private static int minSize() {
        int left = Arrays.stream(lessons).max().orElse(0);
        int right = 0;

        for(int lesson: lessons) {
            right += lesson;
        }
        int res = right;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(canRecord(mid)) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    private static boolean canRecord(int size) {
        int cnt = 1;
        int cur = 0;

        for(int lesson : lessons) {
            if(lesson > size) {
                return false;
            }
            if(cur + lesson > size) {
                cnt++;
                cur = 0;
            }
            cur += lesson;
        }

        return cnt <= M;
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
