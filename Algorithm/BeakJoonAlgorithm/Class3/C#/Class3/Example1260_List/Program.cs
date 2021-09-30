using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Example1260_List
{
    class Program
    {
        static ArrayList[] list;
        static bool[] check;

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int M = int.Parse(s[1]);
            int V = int.Parse(s[2]);

            list = new ArrayList[N + 1];

            for (int i = 1; i <= N; i++)
            {
                list[i] = new ArrayList();
            }

            for (int i = 0; i < M; i++)
            {
                s = Console.ReadLine().Split(' ');
                int x = int.Parse(s[0]);
                int y = int.Parse(s[1]);

                list[x].Add(y);
                list[y].Add(x); // 양방향 간선 > list 저장
            }

            for (int i = 1; i <= N; i++)
            {
                list[i].Sort();
            }

            check = new bool[N + 1];
            dfs(V);

            check = new bool[N + 1];
            bfs(V);
        }

        private static void dfs(int v)
        {
            if (check[v])
                return;

            check[v] = true;
            Console.Write(v + " ");

            foreach (int item in list[v])
            {
                if (!check[item]) // check 하지 않았을경우
                    dfs(item);
            }
        }

        private static void bfs(int v)
        {
            LinkedList<int> queue = new LinkedList<int>();

            queue.AddLast(v);
            check[v] = true;
            StringBuilder sb = new StringBuilder();
            sb.Append("\n");
            while(queue.Count > 0)
            {
                int temp = queue.First.Value;
                queue.RemoveFirst();
                sb.Append(temp).Append(" ");
                foreach (int item in list[temp])
                {
                    if (!check[item])
                    {
                        queue.AddLast(item);
                        check[item] = true;
                    }
                }
            }

            Console.Write(sb);
        }
    }
}
