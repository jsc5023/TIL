using System;
using System.Collections;
using System.Text;

namespace Example11725
{
    class Program
    {
        static ArrayList[] list;
        static StringBuilder sb;
        static bool[] visited;
        static int[] parents;
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            list = new ArrayList[N + 1];

            for (int i = 1; i <= N; i++)
            {
                list[i] = new ArrayList();
            }

            string[] s;

            for (int i = 1; i < N; i++)
            {
                s = Console.ReadLine().Split(' ');
                int v1 = int.Parse(s[0]);
                int v2 = int.Parse(s[1]);

                list[v1].Add(v2);
                list[v2].Add(v1);
            }

            parents = new int[N + 1];

            dfs(list, parents, N, 1, 0);

            sb = new StringBuilder();

            for (int i = 2; i <= N; i++)
            {
                sb.Append(parents[i]).Append("\n");
            }

            Console.Write(sb);
            
        }

        private static void dfs(ArrayList[] list, int[] parents, int N, int start, int parent)
        {
            parents[start] = parent;
            foreach (int item in list[start])
            {
                if (item != parent)
                    dfs(list, parents, N, item, start);
            }
        }
    }
}
