using System;

namespace Example10026
{
    class Program
    {
        static char[,] color;
        static int[] dx = { -1, 0, 0, 1 };
        static int[] dy = { 0, 1, -1, 0 };
        static bool[,] visited;
        static int N;

        static void Main(string[] args)
        {
            N = int.Parse(Console.ReadLine());

            color = new char[N + 1, N + 1];
            visited = new bool[N + 1, N + 1];
            for (int i = 0; i < N; i++)
            {
                string s = Console.ReadLine();
                for (int j = 0; j < N; j++)
                {
                    color[i, j] = s[j];
                }
            }

            int cnt = 0;
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (!visited[i, j])
                    {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            int normal_cnt = cnt;
            cnt = 0;
            visited = new bool[N + 1, N + 1];

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (color[i, j] == 'G')
                    {
                        color[i, j] = 'R';
                    }
                }
            }

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (!visited[i, j])
                    {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }

            int abnormal_cnt = cnt;
            Console.Write(normal_cnt + " " + abnormal_cnt);
        }

        public static void dfs(int x, int y)
        {
            visited[x, y] = true;
            char tmp_char = color[x, y];
            for (int i = 0; i < 4; i++)
            {
                int new_x = x + dx[i];
                int new_y = y + dy[i];

                if (new_x < 0 || new_y < 0 || new_x > N || new_y > N)
                {
                    continue;
                }

                if (!visited[new_x, new_y] && color[new_x, new_y] == tmp_char)
                {
                    dfs(new_x, new_y);
                }
            }
        }
    }
}
