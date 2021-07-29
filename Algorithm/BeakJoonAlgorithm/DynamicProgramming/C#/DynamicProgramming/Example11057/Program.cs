using System;

namespace Example11057
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[,] dp = new int[1001, 10];

            int ans = 0;

            for (int i = 0; i < 10; i++)
            {
                dp[1,i] = 1;
            }


            for (int i = 2; i <= n; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    for (int k = j; k < 10; k++)
                    {
                        dp[i,j] = (dp[i,j] + dp[i - 1, k]) % 10007;
                    }
                }
            }

            for (int i = 0; i < 10; i++)
            {
                ans = (ans + dp[n, i]) % 10007;
            }

            Console.Write(ans);
        }
    }
}
