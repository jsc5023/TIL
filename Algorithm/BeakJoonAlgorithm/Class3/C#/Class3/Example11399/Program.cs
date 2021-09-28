using System;

namespace Example11399
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int[] arr = new int[N];
            int[] dp = new int[N+1];
            string[] s = Console.ReadLine().Split(' ');

            for (int i = 0; i < N; i++)
            {
                arr[i] = int.Parse(s[i]);
            }

            Array.Sort(arr);

            long result = 0;

            dp[0] = arr[0];

            for (int i = 1; i < N; i++)
            {
                dp[i] = dp[i-1] + arr[i];
            }

            for (int i = 0; i < N; i++)
            {
                result += dp[i];
            }

            Console.Write(result);
        }
    }
}
