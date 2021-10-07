using System;

namespace Example11724
{
    class Program
    {
        static int[,] arr;
        static bool[] visit;
        static int N = 0;
        static int M = 0;

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');
            N = int.Parse(s[0]);
            M = int.Parse(s[1]);

            visit = new bool[N + 1];

            Array.Fill(visit, false);

            arr = new int[N + 1, N + 1];

            for (int i = 0; i < M; i++)
            {
                s = Console.ReadLine().Split(' ');
                int v1 = int.Parse(s[0]);
                int v2 = int.Parse(s[1]);

                arr[v1, v2] = arr[v2, v1] = 1;
            }

            int cnt = 0;

            for (int i = 1; i <= N; i++)
            {
                if(!visit[i])
                {
                    dfs(i);
                    cnt++;
                }
            }

            Console.Write(cnt);
        }

        public static void dfs(int v)
        {
            if (visit[v])
                return;
            else
            {
                visit[v] = true;
                for (int i = 1; i <= N; i++)
                {
                    if (arr[v,i] == 1)
                        dfs(i);
                }
            }
        }
    }
}
