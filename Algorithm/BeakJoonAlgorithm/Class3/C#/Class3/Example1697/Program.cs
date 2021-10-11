using System;
using System.Collections.Generic;

namespace Example1697
{
    class Program
    {
        static int N;
        static int K;
        static int[] visit = new int[100001];
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            N = int.Parse(s[0]);
            K = int.Parse(s[1]);

            if(N == K)
            {
                Console.Write(0);
            }
            else
            {
                bfs(N);
            }
        }

        private static void bfs(int n)
        {
            Queue<int> queue = new Queue<int>();
            queue.Enqueue(n);
            visit[n] = 1;

            while(queue.Count > 0)
            {
                int temp = queue.Dequeue();

                for (int i = 0; i < 3; i++)
                {
                    int next;

                    if (i == 0)
                        next = temp + 1;
                    else if (i == 1)
                        next = temp - 1;
                    else
                        next = temp * 2;

                    if(next == K)
                    {
                        Console.Write(visit[temp]);
                        return;
                    }

                    if (next >= 0 && next < visit.Length && visit[next] == 0)
                    {
                        queue.Enqueue(next);
                        visit[next] = visit[temp] + 1;
                    }
                }

            }
        }
    }
}
