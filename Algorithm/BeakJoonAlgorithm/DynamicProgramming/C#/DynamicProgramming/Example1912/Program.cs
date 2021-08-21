using System;

namespace Example1912
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] dt = new int[n + 1];

            string[] inputString = Console.ReadLine().Split(' ');

            for (int i = 0; i < n; i++)
            {
                dt[i] = int.Parse(inputString[i]);
            }

            int[] dp2 = new int[n + 1];
            dp2[1] = Math.Max(dt[1], dt[0] + dt[1]);

            for (int i = 2; i < n; i++)
            {
                dp2[i] = Math.Max(dp2[i - 1] + dt[i], dt[i]);
            }

            int[] dp = new int[n + 1];
            dp[0] = dt[0];
            for (int i = 1; i < n; i++)
            {
                dp[i] = Math.Max(dp[i - 1], dp2[i]);
            }
            dp[n - 1] = Math.Max(dp[0], dp[n - 1]);

            Console.Write(dp[n - 1]);

        }
    }
}
