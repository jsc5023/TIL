import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example1920 {
	
	public static int binarySearch(int[] arrN, int findNum) {
		
		int start = 0;
		int end = arrN.length - 1;
		
		while(start <= end) {
			
			int mid = (end + start) / 2;
			
			if(arrN[mid] == findNum)
				return 1;
			else if(arrN[mid] < findNum)
				start = mid + 1;
			else
				end = mid - 1;
		}
		
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arrN = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrN);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			int result = binarySearch(arrN, Integer.parseInt(st.nextToken()));
			sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
}
