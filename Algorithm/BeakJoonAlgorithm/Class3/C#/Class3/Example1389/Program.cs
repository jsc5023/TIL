using System;
using System.Collections.Generic;

namespace Example1389
{
    class Program
    {
        static int N = 0;
        static int M = 0;
        static int[,] arr;
        static bool[] visit;
        static int[] nowCnt;

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            N = int.Parse(s[0]);
            M = int.Parse(s[1]);

            arr = new int[N + 1, N + 1];
            visit = new bool[N + 1];
            nowCnt = new int[N + 1];
            for (int i = 0; i < M; i++)
            {
                s = Console.ReadLine().Split(' ');
                int v1 = int.Parse(s[0]);
                int v2 = int.Parse(s[1]);
                arr[v1, v2] = arr[v2, v1] = 1;
            }

            for (int i = 1; i <= N; i++)
            {
                Array.Fill(visit, false);
                bfs(i);
            }
            Console.Write(nowCnt[1]);
        }

        private static void bfs(int v)
        {
            Queue<int> queue = new Queue<int>();

            queue.Enqueue(v);
            if (visit[v] == false)
                visit[v] = true;
            else
                return;

            for (int i = 1; i <= N; i++)
            {
                if (visit[i] == false && arr[v, i] == 1)
                {
                    queue.Enqueue(i);
                    visit[i] = true;
                    nowCnt[v]++;
                }
            }
        }
    }
}
