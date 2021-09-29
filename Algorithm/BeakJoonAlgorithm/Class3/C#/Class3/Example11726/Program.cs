using System;

namespace Example11726
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] dp = new int[n + 4];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 3;
            for (int i = 4; i <= n; i++)
            {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
            }

            Console.Write(dp[n]);
        }
    }
}
