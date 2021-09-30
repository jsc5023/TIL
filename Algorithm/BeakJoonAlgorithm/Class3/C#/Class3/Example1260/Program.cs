using System;
using System.Collections.Generic;
using System.Text;

namespace Example1260
{
    class Program
    {
        static int[,] arr;
        static bool[] visit;
        static int N, M, V;

        static void Main(string[] args)
        {
            // 우선 행렬로 구해보기
            string[] s = Console.ReadLine().Split();

            N = int.Parse(s[0]);
            M = int.Parse(s[1]);
            V = int.Parse(s[2]);

            arr = new int[N+1,N+1];
            visit = new bool[N + 1];

            Array.Fill(visit, false);

            for (int i = 0; i < M; i++)
            {
                s = Console.ReadLine().Split(' ');
                int v1 = int.Parse(s[0]);
                int v2 = int.Parse(s[1]);

                arr[v1, v2] = 1;
                arr[v2, v1] = 1;
            }

            dfs(V);

            Array.Fill(visit, false);
            bfs(V);
        }

        private static void dfs(int v)
        {
            visit[v] = true;
            

            Console.Write(v + " ");

            for (int j = 1; j < N + 1; j++)
            {
                if (arr[v, j] == 1 && visit[j] == false)
                {
                    dfs(j); // 내가 찾은 경로가 만약에 다른 경로가 있으면 바로 다음 곳으로 이동시키고 만약에 없으면, 다시 리커해서 돌아오는 방식임.
                }
            }
        }

        private static void bfs(int v)
        {
            LinkedList<int> queue = new LinkedList<int>();
            queue.AddLast(v);
            visit[v] = true;
            StringBuilder sb = new StringBuilder();
            sb.Append("\n");
            while (queue.Count > 0)
            {
                int temp = queue.First.Value;
                queue.RemoveFirst();

                sb.Append(temp + " ");
                for (int j = 1; j <= N; j++)
                {
                    if (arr[temp, j] == 1 && visit[j] == false)
                    {
                        queue.AddLast(j);
                        visit[j] = true;
                    }
                }
            }
            Console.Write(sb);
        }

       
    }
}
