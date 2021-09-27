using System;
using System.Text;

namespace Example9095
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            int[] dp = new int[12];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= 11; i++)
            {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            StringBuilder sb = new StringBuilder();
            while (T-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                sb.Append(dp[n]).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
