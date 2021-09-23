import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example1676 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt2 = 0;
		int cnt5 = 0;
		int result = 0;
		
		for (int i = 1; i <= N; i++) {
			
			int nowIndex = i;
			
			while(nowIndex > 0) {
				if(nowIndex % 2 == 0) {
					cnt2++;
					nowIndex /= 2;
				}
				else
					break;
			}
			
			while(nowIndex > 0) {
				if(nowIndex % 5 == 0) {
					cnt5++;
					nowIndex /= 5;
				}
				else
					break;
			}
		}
		
		result = Math.min(cnt2, cnt5);
		
		System.out.print(result);
	}

}
