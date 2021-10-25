using System;
using System.Collections.Generic;
using System.Text;

namespace Example9019
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            StringBuilder sb = new StringBuilder();
            while (T-- > 0)
            {
                string[] s = Console.ReadLine().Split(' ');

                int a = int.Parse(s[0]);
                int b = int.Parse(s[1]);

                string[] command = new String[10000];
                bool[] visited = new bool[10000];
                Queue<int> queue = new Queue<int>();

                visited[a] = true;
                queue.Enqueue(a);

                Array.Fill(command, "");

                while ((queue.Count > 0) && !visited[b])
                {
                    int now = queue.Dequeue();

                    int D = (2 * now) % 10000; // D연산
                    int S = (now == 0) ? 9999 : now - 1; // S연산
                    int L = (now % 1000) * 10 + now / 1000; // L연산
                    int R = (now % 10) * 1000 + now / 10; // R연산

                    if (!visited[D])
                    {
                        queue.Enqueue(D);
                        visited[D] = true;
                        command[D] = command[now] + "D";
                    }

                    if (!visited[S])
                    {
                        queue.Enqueue(S);
                        visited[S] = true;
                        command[S] = command[now] + "S";
                    }
                    if (!visited[L])
                    {
                        queue.Enqueue(L);
                        visited[L] = true;
                        command[L] = command[now] + "L";
                    }
                    if (!visited[R])
                    {
                        queue.Enqueue(R);
                        visited[R] = true;
                        command[R] = command[now] + "R";
                    }
                }
                sb.Append(command[b]).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
