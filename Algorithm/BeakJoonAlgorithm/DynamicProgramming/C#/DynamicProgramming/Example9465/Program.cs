﻿using System;

namespace Example9465
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());
            int[,] startDp = new int[2, 100001];
            int[,] resultDp = new int[3, 1000001];

            for (int i = 0; i < T; i++)
            {
                int n = int.Parse(Console.ReadLine());

                string[] firstRowString = Console.ReadLine().Split(' ');
                for (int j = 0; j < firstRowString.Length - 1; j++)
                    startDp[0, j] = int.Parse(firstRowString[j]);

                string[] secondRowString = Console.ReadLine().Split(' ');
                for (int j = 0; j < secondRowString.Length - 1; j++)
                    startDp[0, j] = int.Parse(secondRowString[j]);
            }










            //int[,] st = new int[2, 100001];
            //int[,] dp = new int[2, 100001];

            //int t;
            //int n;

            //t = int.Parse(Console.ReadLine());

            //for (int i = 1; i <= t; i++)
            //{
            //    n = int.Parse(Console.ReadLine());

            //    for (int j = 0; j < n; j++)
            //        st[0,j] = int.Parse(Console.ReadLine());

            //    for (int j = 0; j < n; j++)
            //        st[1,j] = int.Parse(Console.ReadLine());

            //    dp[0,0] = st[0,0];
            //    dp[1,0] = st[1,0];
            //    dp[0,1] = st[0,1] + dp[1,0];
            //    dp[1,1] = st[1,1] + dp[0,0];

            //    for (int j = 2; j < n; j++)
            //    {
            //        dp[0,j] = st[0,j] + Math.Max(dp[1,j - 1], dp[1,j - 2]);
            //        dp[1,j] = st[1,j] + Math.Max(dp[0,j - 1], dp[0,j - 2]);
            //    }

            //    Console.WriteLine(Math.Max(dp[0,n - 1], dp[1,n - 1]));

            //}
        }
    }
}
