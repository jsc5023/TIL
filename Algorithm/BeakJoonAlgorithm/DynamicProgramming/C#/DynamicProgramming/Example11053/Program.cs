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

            ArrayList dp = new ArrayList();

            dp.Add(dt[0]);
            for (int i = 1; i <= n; i++)
            {
                if((int)dp[dp.Count-1] <= dt[i])
                {
                    dp.Add(dt[i]);
                }
            }

            Console.Write(dp.Count);
        }
    }
}
