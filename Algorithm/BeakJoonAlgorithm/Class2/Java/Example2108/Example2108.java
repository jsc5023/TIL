import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Example2108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] result = new int[4];
		int[] arrFreq = new int[8001];
		int maxFreq = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arrFreq[arr[i]+4000]++;
			if(maxFreq < arrFreq[arr[i]+4000]) {
				maxFreq = arrFreq[arr[i]+4000];
			}
		}
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += arr[i];
		}
		
		result[0] = (int)Math.round((double)sum / (double)N);
		
		Arrays.sort(arr);
		
		result[1] = arr[(0 + N - 1) / 2];
		
		int cnt = 0;
		int maxFreqNum = 0;
		for (int i = 0; i <= 8000; i++) {
			if(arrFreq[i] == maxFreq) {
				maxFreqNum = i-4000;
				cnt++;
				if(cnt >= 2) {
					break;
				}
			}
		}
		
		result[2] = maxFreqNum;
		
		result[3] = (arr[N-1]- arr[0]);
		
		for (int i = 0; i < 4; i++) {
			System.out.println(result[i]);
		}
	}

}
