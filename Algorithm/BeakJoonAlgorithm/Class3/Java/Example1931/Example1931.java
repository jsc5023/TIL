import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example1931 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		StringTokenizer st;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken()); // ���۽ð�
			arr[i][1] = Integer.parseInt(st.nextToken()); // ������ �ð�
		}
		
		Arrays.sort(arr, (int[] a, int[] b) -> {
			if(a[1] == b[1])
				return a[0] - b[0];
			return a[1] - b[1];
		});
		
		int cnt = 0;
		int prev = 0;
		
		for (int i = 0; i < N; i++) {
			if(prev <= arr[i][0]) {
				prev = arr[i][1];
				cnt++;
			}
		}
		
		System.out.print(cnt);
	}

}
