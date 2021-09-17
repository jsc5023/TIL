import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example2805 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long max = 0;
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] > max)
				max = arr[i];
		}
		
		long min = 0;
		long mid = 0;
		
		while(min < max) {
			
			long sum = 0;
			
			mid = (min + max) / 2;
			
			for (int i = 0; i < N; i++) {
				if(arr[i] - mid > 0)
					sum += (arr[i] - mid);
			}
			
			if(sum < M)
				max = mid;
			else
				min = mid + 1;
		}
		
		System.out.println(min - 1);
	}

}
