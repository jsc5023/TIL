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

            int min = int.MaxValue;

            for (int i = 1; i <= N; i++)
            {
                if (nowCnt[i] < min)
                {
                    min = nowCnt[i];
                }
            }

            for (int i = 1; i <= N; i++)
            {
                if (nowCnt[i] == min)
                {
                    Console.Write(i);
                    break;
                }
            }
        }

        private static void bfs(int v)
        {
            Queue<Node> queue = new Queue<Node>();

            queue.Enqueue(new Node(v, 0));
            if (visit[v] == false)
                visit[v] = true;
            else
                return;

            while(queue.Count > 0)
            {
                int x = queue.Peek().X;
                int dist = queue.Dequeue().Dist;

                for (int i = 1; i <= N; i++)
                {
                    if (visit[i] == false && arr[x, i] == 1)
                    {
                        queue.Enqueue(new Node(i, dist+1));
                        visit[i] = true;
                        nowCnt[v] += dist + 1;
                    }
                }
            }
        }
    }

    class Node
    {
        int x;
        int dist;

        public int X
        {
            get { return x; }
            set { x = value; }
        }

        public int Dist
        {
            get { return dist; }
            set { dist = value; }
        }

        public Node(int _x, int d)
        {
            x = _x;
            dist = d;
        }
    }

}
