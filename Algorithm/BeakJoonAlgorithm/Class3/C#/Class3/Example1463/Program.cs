using System;

namespace Example1463
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int[] dp = new int[N + 3];

            dp[1] = 0;
            dp[2] = 1;
            dp[3] = 1;

            for (int i = 4; i <= N; i++)
            {
                int min = int.MaxValue;
                min = Math.Min(min, dp[i - 1] + 1);
                if(i % 2 == 0)
                    min = Math.Min(min, dp[i / 2] + 1);
                if (i % 3 == 0)
                    min = Math.Min(min, dp[i / 3] + 1);
                dp[i] = min;
            }

            Console.Write(dp[N]);
        }
    }
}
