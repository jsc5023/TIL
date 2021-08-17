using System;
using System.Collections;

namespace Example11053
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] dt = new int[n + 1];

            string[] firstRowString = Console.ReadLine().Split(' ');

            for (int i = 0; i < firstRowString.Length; i++)
            {
                dt[i] = int.Parse(firstRowString[i]);
            }

            int[] dp = new int[n + 1];

            for (int i = 0; i <= n; i++)
            {
                dp[i] = 1;
                for (int j = 0; j < i; j++)
                {
                    if (dt[j] < dt[i] && dp[j] + 1 > dp[i])
                        dp[i] = dp[j] + 1;
                }
            }

            int max = 0;
            for (int i = 0; i < n; i++)
            {
                max = Math.Max(dp[i], max);
            }
            Console.Write(max);
        }
    }
}
