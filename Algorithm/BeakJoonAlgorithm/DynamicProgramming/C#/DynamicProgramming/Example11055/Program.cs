using System;

namespace Example11055
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string[] inputNum = Console.ReadLine().Split(' ');

            int[] dt = new int[n + 1];

            for (int i = 0; i < inputNum.Length; i++)
            {
                dt[i] = int.Parse(inputNum[i]);
            }

            int[] dp = new int[n + 2];

            dp[0] = dt[0];
            int result = 0;
            result = dp[0];

            for (int i = 1; i < n; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    if (dt[j] < dt[i])
                        dp[i] = Math.Max(dp[i], dp[j]);
                }

                dp[i] += dt[i];
                result = Math.Max(result, dp[i]);
            }

            Console.Write(result);
        }
    }
}
