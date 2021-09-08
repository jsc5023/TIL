import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] resultSave = new int[1001];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		resultSave[1] = 1;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					resultSave[i] = 1;
					break;
				}
			}
		}
		// 1이면 소수가 아니다, 0이면 소수이다
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int inputNum = Integer.parseInt(st.nextToken());
			if(resultSave[inputNum] == 0) {
				cnt++;
			}
		}
		
		System.out.print(cnt);
		
	}

}
