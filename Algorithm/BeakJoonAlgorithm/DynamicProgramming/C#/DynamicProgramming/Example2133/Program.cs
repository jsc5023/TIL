using System;

namespace Example2133
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int result = Calc(n);

            Console.Write(result);
        }

        private static int Calc(int n)
        {
            int[] dp = new int[n + 7];

            dp[0] = 0;
            dp[1] = 0;
            dp[2] = 3;
            dp[3] = 0;
            dp[4] = dp[2] * 3 + 2;
            dp[5] = 0;

            for (int i = 6; i <= n; i+=2)
            {
                dp[i] = dp[i - 2] * 3;
                for (int j = i - 4; j >= 2; j-=2)
                {
                    dp[i] += dp[j] * 2;
                }
                dp[i] += 2;
            }

            return dp[n];
        }
    }
}
