using System;

namespace Example11727
{
    class Program
    {
        static void Main(string[] args)
        {
            // 점화식을 구하는것이 핵심입니다.

            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[n + 2];

            dp[0] = 0; dp[1] = 1; dp[2] = 3;
            for (int i = 3; i <= n; i++)
            {
                dp[i] = (dp[i - 1] + dp[i-2] * 2) % 10007;
            }

            Console.Write(dp[n]);
        }
    }
}
