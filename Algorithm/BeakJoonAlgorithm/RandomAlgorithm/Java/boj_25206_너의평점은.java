import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_25206_너의평점은 {

    static FastReader scan = new FastReader();
    static String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };
    static double[] gradeScores = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0 };

    public static void main(String[] args) {
        double total = 0;
        double scoreTotal = 0;

        for(int i = 0; i < 20; i++) {
            String[] str = scan.nextLine().split(" ");
            double score = Double.parseDouble(str[1]); // 학점

            if(str[2].equals("P")) {
                continue;
            }
            double val = gradeScores[find(str[2])]; // 과목평점

            total += (score * val);
            scoreTotal += score;
        }

        System.out.print(String.format("%.6f", total / scoreTotal));

    }

    private static int find(String s) {

        for(int i = 0; i < grades.length; i++) {
            if(s.equals(grades[i])) {
                return i;
            }
        }

        return 0;
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

        String nextLine() {
            String readLine = "";
            try {
                readLine = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();;
            }
            return readLine;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
