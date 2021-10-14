using System;
using System.Collections.Generic;

namespace Example2178
{
    class Program
    {
        static int N;
        static int M;
        static int[,] map;
        static bool[,] visit;
        static int[] dx = { -1, 1, 0, 0 };
        static int[] dy = { 0, 0, -1, 1 };

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            N = int.Parse(s[0]);
            M = int.Parse(s[1]);

            map = new int[N, M];
            visit = new bool[N, M];
            for (int i = 0; i < N; i++)
            {
                string str = Console.ReadLine();
                for (int j = 0; j < M; j++)
                {
                    map[i, j] = int.Parse(str[j].ToString());
                    visit[i, j] = false;
                }
            }

            visit[0, 0] = true; 
            findRoad(0, 0);
            Console.Write(map[N - 1, M - 1]);
        }

        private static void findRoad(int x, int y)
        {
            Queue<int[]> queue = new Queue<int[]>();
            queue.Enqueue(new int[] { x, y });

            while (queue.Count > 0)
            {
                int[] now = queue.Dequeue();
                int nowX = now[0];
                int nowY = now[1];

                for (int i = 0; i < 4; i++)
                {
                    int nextX = nowX + dx[i];
                    int nextY = nowY + dy[i];

                    if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                        continue;

                    if (visit[nextX, nextY] || map[nextX, nextY] == 0)
                        continue;

                    queue.Enqueue(new int[] { nextX, nextY });
                    map[nextX, nextY] = map[nowX, nowY] + 1;
                    visit[nextX, nextY] = true;
                }
            }
        }
    }
}
