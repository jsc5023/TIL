using System;

namespace Example2579
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] dt = new int[n + 2];
            int[,] dp = new int[n + 2,3];
            for (int i = 1; i <= n; i++)
                dt[i] = int.Parse(Console.ReadLine());

            dp[1,1] = dt[1];
            dp[1,2] = 0;

            dp[2,1] = dt[2];
            dp[2,2] = dt[1] + dt[2];

            for (int i = 3; i <= n; i++)
            {
                dp[i,1] = Math.Max(dp[i - 2,1], dp[i - 2,2]) + dt[i];
                dp[i,2] = dp[i - 1,1] + dt[i];
            }

            Console.Write(Math.Max(dp[n, 1], dp[n, 2]));
        }
    }
}
