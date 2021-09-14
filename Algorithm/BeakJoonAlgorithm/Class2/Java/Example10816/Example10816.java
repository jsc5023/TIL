import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example10816 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		
		
		for (int i = 0; i < M; i++) {
			
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(" ");
		}
		
		System.out.print(sb);
		
	}
	
	public static int lowerBound(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length;
		
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key <= arr[mid]) {
				hi = mid;
			}
			
			else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}

	public static int upperBound(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key < arr[mid]) {
				hi = mid;
			}
			
			else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
}
