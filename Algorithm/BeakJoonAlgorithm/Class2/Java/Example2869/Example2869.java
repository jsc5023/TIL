import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(str.nextToken());
		int B = Integer.parseInt(str.nextToken());
		int V = Integer.parseInt(str.nextToken());

		int result = 0;
		
		result = (V - A) / (A - B) + 1;
		
		if((V - A) % (A - B) != 0 ) {
			result++;
		}
		
		System.out.println(result);
	}

}
