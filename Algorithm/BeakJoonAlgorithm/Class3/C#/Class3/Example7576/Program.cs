using System;
using System.Collections.Generic;

namespace Example7576
{
    class Program
    {
        static int M, N;
        static int[,] arr;
        static int[] dx = { -1, 1, 0, 0 };
        static int[] dy = { 0, 0, 1, -1 };

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            M = int.Parse(s[0]);
            N = int.Parse(s[1]);

            arr = new int[N, M];
            for (int i = 0; i < N; i++)
            {
                s = Console.ReadLine().Split(' ');
                for (int j = 0; j < M; j++)
                {
                    arr[i, j] = int.Parse(s[j]);
                }
            }

            bfs(arr, N, M);
        }

        private static void bfs(int[,] arr, int n, int m)
        {
            Queue<TomatoLocation> queue = new Queue<TomatoLocation>();

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if (arr[i, j] == 1)
                        queue.Enqueue(new TomatoLocation(i, j));
                }
            }

            while (queue.Count > 0)
            {
                TomatoLocation tomatoLocation = queue.Dequeue();
                for (int i = 0; i < 4; i++)
                {
                    int nextX = tomatoLocation.X + dx[i];
                    int nextY = tomatoLocation.Y + dy[i];

                    if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    {
                        continue;
                    }

                    if (arr[nextX, nextY] != 0)
                    {
                        continue;
                    }

                    arr[nextX, nextY] = arr[tomatoLocation.X, tomatoLocation.Y] + 1;
                    queue.Enqueue(new TomatoLocation(nextX, nextY));
                }
            }

            int max = 0;
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    if (arr[i, j] == 0)
                    {
                        Console.WriteLine(-1);
                        return;
                    }
                    max = Math.Max(max, arr[i, j]);
                }
            }
            Console.WriteLine(max - 1);
        }
    }

    class TomatoLocation
    {
        int x;
        int y;

        public TomatoLocation(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public int X {
            get { return x; }
        }

        public int Y
        {
            get { return y; }
        }
    }

}
