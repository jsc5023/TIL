﻿using System;

namespace Example9095
{
    class Program
    {
        static void Main(string[] args)
        {
            //풀이법 1, 2, 3,4,5 를 직접 계산해서 점화식을 찾아야됩니다.
            //그후 그 점화식을 바탕으로 수식을 작성합니다.
            int T = int.Parse(Console.ReadLine());

            for (int i = 0; i < T; i++)
            {
                int n = int.Parse(Console.ReadLine());

                int[] dp = new int[n + 3];
                dp[1] = 1; dp[2] = 2; dp[3] = 4;
                for (int j = 4; j <= n; j++)
                {
                    dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
                }
                Console.WriteLine(dp[n]);
            }
        }
    }
}
