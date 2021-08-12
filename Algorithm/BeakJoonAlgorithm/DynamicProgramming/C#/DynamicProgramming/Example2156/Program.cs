using System;

namespace Example2156
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] dt = new int[n + 1];
            int[] dp = new int[n + 1];
            for (int i = 0; i < n; i++)
            {
                int juices = int.Parse(Console.ReadLine());

                dt[i] = juices;
            }

            if(n <= 2)
            {
                for (int i = 0; i < n; i++)
                {
                    dp[n] += dt[i];
                }
            }
            else
            {
                //dp[0] = dt[0];
                //dp[1] = dt[0] + dt[1];
                //for (int i = 2; i < n; i++)
                //{
                //    dp[i] = dp[i-1]
                //}
            }

            Console.Write(dp[n]);
        }
    }
}
