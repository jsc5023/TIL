using System;

namespace Example2606
{
    class Program
    {
        static int cnt = 0; // 감염시킨 컴퓨터 수

        static void dfs(int[,] graph, bool[] check, int v)
        {
            if (check[v] == true) return;

            check[v] = true; // 방문처리 후
            cnt++; // 감염된 컴퓨터 수 증가, 여기엔 최초 방문 1번 컴퓨터도 포함된다.

            for (int i = 0; i < graph.GetLength(1); i++)
            { // 인접행렬을 탐색
                if (graph[v,i] == 1 && !check[i]) // 연결된 정점이면서 방문하지 않은 경우
                    dfs(graph, check, i); // DFS 수행
            }
        }

        static void Main(string[] args)
        {
            int computers = int.Parse(Console.ReadLine()); // 정점(node)의 수
            int pair = int.Parse(Console.ReadLine()); // 간선(edge)의 수

            int[,] graph = new int[computers + 1, computers + 1];
            bool[] check = new bool[computers + 1];

            for (int i = 0; i < pair; i++)
            {
                string[] s = Console.ReadLine().Split(' ');

                int v1 = int.Parse(s[0]);
                int v2 = int.Parse(s[1]);

                graph[v1, v2] = 1;
                graph[v2, v1] = 1;
            }

            dfs(graph, check, 1);

            Console.Write(cnt - 1);
        }
    }
}
