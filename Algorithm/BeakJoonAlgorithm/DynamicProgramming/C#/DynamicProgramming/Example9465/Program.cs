using System;

namespace Example9465
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            int[,] dp = new int[2, 100001];
            for (int i = 0; i < t; i++)
            {
                int n = int.Parse(Console.ReadLine());

                for (int j = 0; j < 2; j++)
                {
                    for (int k = 1; k <= n; k++)
                    {
                        dp[j,k] = int.Parse(Console.ReadLine());
                    }
                }
                Console.Write(dp[2, n]);
            }
        }
    }
}
