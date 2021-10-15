using System;
using System.Text;

namespace Example2667
{
    class Program
    {
        static int[] dx = { 0, 0, 1, -1 };
        static int[] dy = { 1, -1, 0, 0 };
        static int[] aparts = new int[25 * 25];
        static int N;
        static int apartNum = 0;
        static bool[,] visit = new bool[25, 25]; //방문여부
        static int[, ] map = new int[25, 25]; //지도
        static void Main(string[] args)
        {
            N = int.Parse(Console.ReadLine());

            //전체 사각형 입력 받기
            for (int i = 0; i < N; i++)
            {
                string s = Console.ReadLine();
                for (int j = 0; j < N; j++)
                {
                    map[i, j] = s[j] - '0';
                }
            }

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (map[i, j] == 1 && !visit[i, j])
                    {
                        apartNum++;
                        dfs(i, j);
                    }
                }
            }

            Array.Sort(aparts);
            Console.WriteLine(apartNum);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < aparts.Length; i++)
            {
                if (aparts[i] == 0)
                {
                }
                else
                {
                    sb.Append(aparts[i]).Append("\n");
                }
            }

            Console.Write(sb);

        }

        private static void dfs(int x, int y)
        {
            visit[x, y] = true;
            aparts[apartNum]++;

            for (int i = 0; i < 4; i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N)
                {
                    if (map[nx, ny] == 1 && !visit[nx, ny])
                    {
                        dfs(nx, ny);
                    }
                }
            }
        }
    }
}
