using System;

namespace Example14500
{
    class Program
    {
        static int[,] paper;
        static int N;
        static int M;
        static int[] dy = { -1, 1, 0, 0 };
        static int[] dx = { 0, 0, -1, 1 };
        static int maxValue = 0;

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            N = int.Parse(s[0]);
            M = int.Parse(s[1]);

            paper = new int[N, M];
            for (int i = 0; i < N; i++)
            {
                s = Console.ReadLine().Split(' ');
                for (int j = 0; j < M; j++)
                {
                    paper[i, j] = int.Parse(s[j]);
                }
            }

            bool[,] visited = new bool[N, M];
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    visited[i, j] = true;
                    dfs(i, j, 1, paper[i, j], visited);
                    visited[i, j] = false;
                    check(i, j);
                }
            }

            Console.Write(maxValue);
        }

        private static void dfs(int y, int x, int cnt, int sum, bool[,] visited)
        {
            if (cnt >= 4)
            {
                maxValue = Math.Max(maxValue, sum);
                return;
            }

            for (int k = 0; k < 4; k++)
            {
                int ny = y + dy[k];
                int nx = x + dx[k];

                if (ny < 0 || nx < 0 || ny >= N || nx >= M || visited[ny, nx])
                {
                    continue;
                }

                visited[ny, nx] = true;
                dfs(ny, nx, cnt + 1, sum + paper[ny, nx], visited);
                visited[ny, nx] = false;
            }
        }

        private static void check(int y, int x)
        {
            if (y < N - 2 && x < M - 1)
                maxValue = Math.Max(maxValue, paper[y, x] + paper[y + 1, x] + paper[y + 2,x] + paper[y + 1,x + 1]);

            if (y < N - 2 && x > 0)
                maxValue = Math.Max(maxValue, paper[y, x] + paper[y + 1, x] + paper[y + 2,x] + paper[y + 1,x - 1]);

            if (y < N - 1 && x < M - 2)
                maxValue = Math.Max(maxValue, paper[y, x] + paper[y,x + 1] + paper[y,x + 2] + paper[y + 1,x + 1]);

            if (y > 0 && x < M - 2)
                maxValue = Math.Max(maxValue, paper[y, x] + paper[y,x + 1] + paper[y,x + 2] + paper[y - 1,x + 1]);
        }
    }
}
