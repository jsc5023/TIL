using System;
using System.Text;

namespace Example11659
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int M = int.Parse(s[1]);

            int[] arr = new int[N + 1];
            int[] dp = new int[N + 1];

            s = Console.ReadLine().Split(' ');

            for (int i = 1; i <= N; i++)
            {
                arr[i] = int.Parse(s[i - 1]);
                dp[i] = dp[i - 1] + arr[i];
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < M; i++)
            {
                s = Console.ReadLine().Split(' ');

                int sum = dp[int.Parse(s[1])] - dp[int.Parse(s[0]) - 1];
                sb.Append(sum).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
