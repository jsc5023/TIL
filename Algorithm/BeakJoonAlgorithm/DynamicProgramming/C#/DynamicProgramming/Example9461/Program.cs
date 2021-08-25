using System;

namespace Example9461
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());

            for (int i = 0; i < t; i++)
            {
                int n = int.Parse(Console.ReadLine());

                ulong[] dp = new ulong[106];
                dp[1] = 1;
                dp[2] = 1;
                dp[3] = 1;
                dp[4] = 2;
                dp[5] = 2;
                for (int j = 6; j <= n; j++)
                {
                    dp[j] += dp[j - 1] + dp[j - 5];
                }

                Console.WriteLine(dp[n]); // Write하니까 틀렸음, line을 변경해야됨
            }
        }
    }
}
