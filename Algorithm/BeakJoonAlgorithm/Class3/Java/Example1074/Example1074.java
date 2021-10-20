import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example1074 {

	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int pow = (int)Math.pow(2, N);
		
		find(pow, r, c);
		
		System.out.print(cnt);
	}
	
	static void find(int pow, int r, int c) {
		
		if (pow == 1)
            return;
		 
		// 4�и� �ڸ���
		// 1��и�
		 if (r < pow / 2 && c < pow / 2)
         {
             find(pow / 2, r, c);
         }
		 //2��и�
         else if (r < pow / 2 && c >= pow / 2)
         {
             cnt += pow * pow / 4;
             find(pow / 2, r, c - pow / 2);
         }
		 // 3��и�
         else if (r >= pow / 2 && c < pow / 2)
         {
             cnt += (pow * pow / 4) * 2;
             find(pow / 2, r - pow / 2, c);
         }
		 // 4��и�
         else
         {
             cnt += (pow * pow / 4) * 3;
             find(pow / 2, r - pow / 2, c - pow / 2);
         }
	}
}
