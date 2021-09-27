using System;

namespace Example2579
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int[] dp = new int[N + 3];

            int max = int.MinValue;

            int[] n = new int[4];
            int[] temp = new int[2];
            if (N >= 1)
                dp[1] = int.Parse(Console.ReadLine());
            if(N >= 2)
            {
                n[2] = int.Parse(Console.ReadLine());
                dp[2] = dp[1] + n[2];
            }
            if(N >= 3)
            {
                n[3] = int.Parse(Console.ReadLine());
                dp[3] = Math.Max(dp[1], n[2]) + n[3];
            }
            if(N >= 4)
            {
                max = int.MinValue;
                temp[0] = int.Parse(Console.ReadLine());
                max = Math.Max(max, dp[4 - 3] + n[4-1] + temp[0]);
                max = Math.Max(max, dp[4 - 2] + temp[0]);
                dp[4] = max;
            }

            for (int i = 5; i <= N; i++)
            {
                temp[1] = int.Parse(Console.ReadLine());
                max = int.MinValue;
                max = Math.Max(max, dp[i - 3] + temp[0] + temp[1]);
                max = Math.Max(max, dp[i - 2] + temp[1]);
                temp[0] = temp[1];
                dp[i] = max;
            }

            Console.Write(dp[N]);
        }
    }
}
