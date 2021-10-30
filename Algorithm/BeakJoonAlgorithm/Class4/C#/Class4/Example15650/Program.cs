
using System;

namespace Example15650
{
    class Program
    {
        // 백트래킹 문제
        public static int[] arr;
        public static int N, M;

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            N = int.Parse(s[0]);
            M = int.Parse(s[1]);

            arr = new int[M];

            dfs(1, 0);
        }

        static void dfs(int at, int depth)
        {

            if (depth == M)
            {
                foreach (var item in arr)
                {
                    Console.Write(item + " ");
                }
                Console.Write("\n");
                return;
            }

            for (int i = at; i <= N; i++)
            {
                arr[depth] = i;
                dfs(i + 1, depth + 1);
            }
        }
    }
}
