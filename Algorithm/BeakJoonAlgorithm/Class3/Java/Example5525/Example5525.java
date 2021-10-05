import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int patternCnt = 0;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		for (int i = 1; i < M - 1; i++) {
			
			if(s.charAt(i - 1) == 'I' && s.charAt(i) == 'O' && s.charAt(i + 1) == 'I') {
				patternCnt++;
				if(patternCnt == N) {
					patternCnt--;
					cnt++;
				}
				i++;
			}
			else
				patternCnt = 0;
		}
		
		System.out.print(cnt);
	}
}
