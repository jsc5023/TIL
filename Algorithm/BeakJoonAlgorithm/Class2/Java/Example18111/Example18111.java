import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example18111 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[][] ground = new int[N][M];
		
		int max = 0;
		int min = 501;
		
		for (int i = 0; i < N; i++) {
			
			String[] s = br.readLine().split(" ");
			
			for (int j = 0; j < M; j++) {
				int groundVal = Integer.parseInt(s[j]);
				
				ground[i][j] = groundVal;
				
				max = Math.max(max, groundVal);
				min = Math.min(min, groundVal);
			}
		}
		

        int minSec = Integer.MAX_VALUE; // 시간
        int resHi = Integer.MIN_VALUE; // 층

        for (int i = min; i <= max; i++)
        { // 최소층 부터 최대층 까지

            int seconds = 0; // 현재 초
            int inventory = B; // 인벤토리상태

            for (int j = 0; j < N; j++)
            {
                for (int k = 0; k < M; k++)
                {
                    int diff = ground[j][k] - i;

                    if (diff > 0)
                    { // 제거해야 함
                        seconds += (Math.abs(diff) * 2); // 현재땅과 지금 반복문의 땅의 차이의 값
                        inventory += Math.abs(diff); // 현재 인벤토리에 추가
                    }
                    else if (diff < 0)
                    { // 추가해야 함
                        seconds += Math.abs(diff);
                        inventory -= Math.abs(diff); // 현재 인벤토리에 제거
                    }
                }
            }

            if (inventory >= 0) // 현재 인벤토리가 포함될때
            {
                if (seconds <= minSec)
                { // 같은값도 포함해야됩니다.
                    minSec = seconds;
                    resHi = i;
                }
            }
        }

        System.out.print(minSec + " " + resHi);
	}

}
