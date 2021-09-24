using System;

namespace Example17626
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[n + 1];

            dp[0] = 0;
            dp[1] = 1;

            int min = 0;
            for (int i = 1; i <= n; i++)
            {
                min = int.MaxValue;
                for (int j = 1; j * j <= i; j++)
                {
                    min = Math.Min(min, dp[i - (j * j)]);
                }

                dp[i] = min + 1;
            }

            Console.Write(dp[n]);
        }
    }
}
