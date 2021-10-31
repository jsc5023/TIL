using System;

namespace Example15652
{
    class Program
    {
        // 15650이랑 거의 같은문제
        static int N, M;
        static int[] arr;

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');
            N = int.Parse(s[0]);
            M = int.Parse(s[1]);
            arr = new int[M];

            dfs(1, 0);
        }

        public static void dfs(int at, int depth)
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
                dfs(i, depth + 1);
            }

        }
    }
}
