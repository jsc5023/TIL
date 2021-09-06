import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;

public class Example10989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10001];
		
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 10000; i++) {
			
			while(arr[i] > 0) {
				sb.append(i).append("\n");
				arr[i]--;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
		
		
	}

}
