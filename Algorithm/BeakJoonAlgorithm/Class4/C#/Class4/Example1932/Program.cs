using System;

namespace Example1932
{
    class Program
    {
        static int[,] arr;
        static int[,] dp;
        static int n;

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());

            arr = new int[n, n];
            dp = new int[n, n];

            for (int i = 0; i < n; i++)
            {
                string[] s = Console.ReadLine().Split(' ');
                for (int j = 0; j < i + 1; j++)
                {
                    arr[i, j] = int.Parse(s[j]);
                }
            }

            // 가장 아래쪽 값부터 채워넣어야 되므로, 가장 아래쪽 값을 기존값과 같도록 한다.
            for (int i = 0; i < n; i++)
            {
                dp[n - 1, i] = arr[n - 1, i];
            }

            Console.Write(find(0, 0));
        }

        // 0, 0 부터 찾기시작한다
        private static int find(int depth, int index)
        {
            if (depth == n - 1)
                return dp[depth, index];

            if (dp[depth, index] == 0)
                dp[depth, index] = Math.Max(find(depth + 1, index), find(depth + 1, index + 1)) + arr[depth, index];

            return dp[depth, index];
        }
    }
}
