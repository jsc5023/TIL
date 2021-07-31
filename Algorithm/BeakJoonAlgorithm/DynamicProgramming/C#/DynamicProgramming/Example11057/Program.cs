using System;

namespace Example11057
{
    class Program
    {
        static void Main(string[] args)
        {
            // 주석으로 점화식 도출하는 과정작성
            // 우선 먼저 n이 1이라고 가정했을때 그러면 0~9까지가 답이므로 10
            // 그후 n이 2라고 가정했을때 dp[1,0] ~ dp[1,9]의 답은 9입니다.

            int n = int.Parse(Console.ReadLine());

            int[,] dp = new int[1001, 10];

            int ans = 0;

            for (int i = 0; i < 10; i++)
            {
                dp[1,i] = 1; // 0~9까지의 수와 동일, 그값은 1이다.
            }


            for (int i = 2; i <= n; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    for (int k = j; k < 10; k++)
                    {
                        dp[i,j] = (dp[i,j] + dp[i - 1, k]) % 10007; // 
                    }
                }
            }

            for (int i = 0; i < 10; i++)
            {
                ans = (ans + dp[n, i]) % 10007;
            }

            Console.Write(ans);
        }
    }
}
