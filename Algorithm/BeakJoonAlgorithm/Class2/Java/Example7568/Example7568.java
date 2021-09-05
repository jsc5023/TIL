import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] xy = new int[2][N];
		int[] result = new int[N];
		
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			xy[0][i] = Integer.parseInt(str[0]);
			xy[1][i] = Integer.parseInt(str[1]);
		}
		
		for (int i = 0; i < N; i++) {
			result[i] = 1;
			for (int j = 0; j < N; j++) {
				if(xy[0][i] < xy[0][j] && xy[1][i] < xy[1][j])
					result[i]++;
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < N; i++) {
			sb.append(result[i]).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}

}
