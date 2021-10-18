import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class PointXYZ{
	int height;
	int row;
	int col;
	
	public PointXYZ(int height, int row, int col) {
		this.height = height;
		this.row = row;
		this.col = col;
	}
}

public class Example7569 {

	static int[] rowArr = { -1 , 0 , 1 , 0 , 0 , 0};
	static int[] colArr = { -1 , 0 , 1 , 0 , 0 , 0};
	static int[] heightArr = { -1 , 0 , 1 , 0 , 0 , 0};
	static int[][][] arr;
	static Queue<PointXYZ> queue = new LinkedList<>();
	static int M, N, H;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N= Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		arr = new int[H + 1][N + 1][M + 1];
		
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= H; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int k = 1; k <= H; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if(arr[i][j][k] == 1)
						queue.offer(new PointXYZ(i, j, k));
				}
			}
		}
	}

}
