using System;
using System.Text;

namespace Example9461
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            long[] dp = new long[101];

            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;

            for (int i = 6; i <= 100; i++)
            {
                dp[i] = dp[i - 1] + dp[i - 5];
            }

            StringBuilder sb = new StringBuilder();

            while(T-- > 0)
            {
                int N = int.Parse(Console.ReadLine());

                sb.Append(dp[N]).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
