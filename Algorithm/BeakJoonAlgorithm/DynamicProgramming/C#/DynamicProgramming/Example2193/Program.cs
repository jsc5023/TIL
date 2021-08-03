using System;

namespace Example2193
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            long[] dp = new long[N+2];

            dp[0] = dp[1] = 1;

            for (int i = 2; i < N; i++)
            {
                dp[i] = dp[i - 1] + dp[i - 2];  
            }

            Console.Write(dp[N-1]);
        }
    }
}
