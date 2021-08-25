using System;

namespace Example2225
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] inputNum = Console.ReadLine().Split(' ');

            int n = int.Parse(inputNum[0]);
            int k = int.Parse(inputNum[1]);

            int[,] dp = new int[201, 201];

            dp[0, 0] = 1;

            for (int i = 1; i <= k; i++)
                dp[0,i] = 1;
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= k; j++)
                {
                    dp[i,j] = (dp[i,j - 1] + dp[i - 1,j]) % 1000000000;
                }
            }

            Console.Write(dp[n, k]); // 어려웠음, Java로 다시풀어보기
        }
    }
}
