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
		

        int minSec = Integer.MAX_VALUE; // �ð�
        int resHi = Integer.MIN_VALUE; // ��

        for (int i = min; i <= max; i++)
        { // �ּ��� ���� �ִ��� ����

            int seconds = 0; // ���� ��
            int inventory = B; // �κ��丮����

            for (int j = 0; j < N; j++)
            {
                for (int k = 0; k < M; k++)
                {
                    int diff = ground[j][k] - i;

                    if (diff > 0)
                    { // �����ؾ� ��
                        seconds += (Math.abs(diff) * 2); // ���綥�� ���� �ݺ����� ���� ������ ��
                        inventory += Math.abs(diff); // ���� �κ��丮�� �߰�
                    }
                    else if (diff < 0)
                    { // �߰��ؾ� ��
                        seconds += Math.abs(diff);
                        inventory -= Math.abs(diff); // ���� �κ��丮�� ����
                    }
                }
            }

            if (inventory >= 0) // ���� �κ��丮�� ���Եɶ�
            {
                if (seconds <= minSec)
                { // �������� �����ؾߵ˴ϴ�.
                    minSec = seconds;
                    resHi = i;
                }
            }
        }

        System.out.print(minSec + " " + resHi);
	}

}
