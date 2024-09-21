import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2239_스도쿠 {

    static FastReader scan = new FastReader();
    static int[][] board;

    public static void main(String[] args) {
        input();
        pro();
    }

    private static void input() {
        board = new int[9][9];

        for(int i = 0; i < 9; i++) {
            String line = scan.next();

            for(int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }
    }

    private static void pro() {
        solveSudoku(0, 0);
    }

    private static boolean solveSudoku(int row, int col) {
        if(col == 9) {
            return solveSudoku(row + 1, 0);
        }

        if(row == 9) {
            printSudoku();
            return true;
        }

        if(board[row][col] == 0) {
            for(int num = 1; num <= 9; num++) {
                if(isValid(row, col, num)) {
                    board[row][col] = num;
                    if(solveSudoku(row, col + 1)) {
                        return true;
                    }
                    board[row][col] = 0;
                }
            }
        } else {
            return solveSudoku(row, col + 1);
        }

        return false;
    }

    private static boolean isValid(int row, int col, int num) {

        for(int i = 0; i < 9; i++) {
            if(board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printSudoku() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
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
