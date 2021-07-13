using System;

namespace Example1463
{
    class Program
    {
        static void Main(string[] args)
        {
            // 문제 풀이 방법 - 작은문제를 먼저 풀고, 그후 순차적으로 수행해 나간다.

            int X = int.Parse(Console.ReadLine());
            int[] dp = new int[X + 1];

            dp[0] = dp[1] = 0;
            for (int i = 2; i <= X; i++)
            {
                dp[i] = dp[i - 1] + 1;
                if (i % 2 == 0)
                    dp[i] = Math.Min(dp[i], dp[i / 2] + 1);
                if (i % 3 == 0)
                    dp[i] = Math.Min(dp[i], dp[i / 3] + 1);
            }

            

            Console.Write(dp[X]);
        }
    }
}
