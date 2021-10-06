using System;

namespace Example11727
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            int[] dp = new int[N + 2];

            dp[1] = 1;
            dp[2] = 3;
            for (int i = 3; i <= N; i++)
            {
                dp[i] = (dp[i - 1] % 10007) + (2 * dp[i - 2] % 10007) ;
                dp[i] %= 10007;
            }

            Console.Write(dp[N]);
        }
    }
}
