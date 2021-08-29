using System;

namespace Example2775
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            for (int i = 0; i < T; i++)
            {
                int k = int.Parse(Console.ReadLine());
                int n = int.Parse(Console.ReadLine());
                int[,] dp = new int[15, 15];

                for (int j = 0; j < 15; j++)
                {
                    dp[0, j] = j;
                }
                for (int j = 1; j <= k; j++)
                {
                    for (int l = 1; l <= n; l++)
                    {
                        for (int m = 0; m <= l; m++)
                        {
                            dp[j, l] += dp[j - 1, m];
                        }
                    }
                }
                Console.WriteLine(dp[k, n]);
            }
        }
    }
}
