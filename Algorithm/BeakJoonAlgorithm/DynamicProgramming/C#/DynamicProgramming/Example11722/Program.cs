using System;

namespace Example11722
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string[] firstNum = Console.ReadLine().Split(' ');

            int[] dt = new int[n + 1]; 
            for (int i = 0; i < firstNum.Length; i++)
            {
                dt[i] = int.Parse(firstNum[i]);
            }

            int[] dp = new int[n + 1];
            for (int i = 0; i < n; i++)
            {
                dp[i] = 1;
                for (int j = 0; j < i; j++)
                {
                    if (dt[i] < dt[j] && dp[j] + 1 > dp[i])
                        dp[i] = dp[j] + 1;
                }
            }

            int arrlength = 0;
            for (int i = 0; i < n; i++)
            {
                arrlength = Math.Max(dp[i], arrlength);
            }

            Console.Write(arrlength);
        }
    }
}
