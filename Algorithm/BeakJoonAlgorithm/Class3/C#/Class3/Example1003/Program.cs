using System;
using System.Text;

namespace Example1003
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            int[,] dp = new int[2, 41];

            dp[0, 0] = 1;
            dp[1, 0] = 0;

            dp[0, 1] = 0;
            dp[1, 1] = 1;

            for (int i = 0; i <= 1; i++)
            {
                for (int j = 2; j <= 40; j++)
                {
                    dp[i, j] = dp[i, j - 1] + dp[i, j - 2];
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < T; i++)
            {
                int N = int.Parse(Console.ReadLine());

                sb.Append(dp[0, N].ToString() + " " + dp[1, N].ToString()).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
