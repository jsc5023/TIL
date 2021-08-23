using System;

namespace Example1699
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] dp = new int[n + 2];
            for (int i = 1; i <= n; i++)
            {
                dp[i] = i; // 처음 최댓값 = 초기값, 1+1+1+... 은 무조건 성립하므로
                for (int j = 1; j*j <= i; j++)
                {
                    if (dp[i] > dp[i - (j * j)] + 1)
                        dp[i] = dp[i - (j * j)] + 1;
                }
            }

            Console.Write(dp[n]);
        }
    }
}
