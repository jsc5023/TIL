import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example11723 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int bitMask = 0; // C#과 다른 방식으로 품(C#은 HashSet을 이용, 여기서는 비트마스크로 사용해서 풀어봄
		for (int i = 0; i < M; i++) {
			String[] s = br.readLine().split(" ");
			
			int inputNum;
			switch (s[0]) {
				case "add":
					inputNum = Integer.parseInt(s[1]);
					bitMask = bitMask | 1<<(inputNum-1); // OR 쉬프트 연산
					break;
					
				case "remove":
					inputNum = Integer.parseInt(s[1]);
					bitMask = bitMask & ~(1<<(inputNum-1));
					break;
					
				case "check":
					inputNum = Integer.parseInt(s[1]);
					sb.append((bitMask & (1 << (inputNum - 1))) != 0 ? "1\n" : "0\n"); 
					break;
					
				case "toggle":
					inputNum = Integer.parseInt(s[1]);
					bitMask ^= (1 << (inputNum - 1)); // ^XOR의 1111
					break;
					
				case "all":
					bitMask |= (~0); // 모든값 11111111
					break;
					
				case "empty":
					bitMask = 0;
					break;
			}
			
		}
		
		System.out.print(sb.toString());
	}
	
}
