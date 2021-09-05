import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int n1 = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);
		
		int min = Math.min(n1, n2);
		int max = Math.max(n1, n2);
		int minresult = 0;
		
		for (int i = 1; i <= min; i++) {
			if(n1 % i == 0 && n2 % i == 0)
				minresult = i;
		}
		
		System.out.println(minresult);
		System.out.println(max / minresult * min);
	}
}
