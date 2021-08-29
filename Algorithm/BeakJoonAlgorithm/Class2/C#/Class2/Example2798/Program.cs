using System;

namespace Example2798
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] str = Console.ReadLine().Split(' ');
            int N = int.Parse(str[0]);
            int M = int.Parse(str[1]);

            int[] dp = new int[N+1];

            str = Console.ReadLine().Split(' ');
            for (int i = 0; i < str.Length; i++)
            {
                dp[i] = int.Parse(str[i]);
            }

            int max = 0;
            int sum = 0;
            for (int i = 0; i < N; i++)
            {
                sum = dp[i];
                for (int j = i+1; j < N; j++)
                {
                    sum += dp[j];
                    for (int k = j+1; k < N; k++)
                    {
                        sum += dp[k];
                        if (sum <= M)
                            max = Math.Max(max, sum);
                        sum = dp[i] + dp[j];
                    }
                    sum = dp[i];
                }
            }

            Console.Write(max);
        }
    }
}
