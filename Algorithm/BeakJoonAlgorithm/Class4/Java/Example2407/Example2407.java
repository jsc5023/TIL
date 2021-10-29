import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2407 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Long cnt = (Long)1;

        ulong[] dp_n = new ulong[m + 1];
        ulong[] dp_m = new ulong[m + 1];
        //ulong[
        dp_n[0] = (ulong)n;
        dp_m[0] = (ulong)m;
        for (int i = 0; i < m; i++)
        {
            dp_n[i + 1] = dp_n[i] - 1;
            dp_m[i + 1] = dp_m[i] - 1;
        }

        for (int i = 0; i < m; i++)
        {
            cnt *= dp_n[i];
            for (int j = 0; j < m; j++)
            {
                if(cnt > 50 && dp_m[j] != 0 && cnt % dp_m[j] == 0)
                {
                    cnt /= dp_m[j];
                    dp_m[j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++)
        {
            if (dp_m[i] != 0)
                cnt /= dp_m[i];
        }

        Console.Write(cnt);
	}
}
