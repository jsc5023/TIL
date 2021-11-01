using System;
using System.Text;

namespace Example15654
{
    class Program
    {
        static int N, M;
        static int[] arr;
        static int[] result;
        static bool[] visited;
        static StringBuilder sb;
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            N = int.Parse(s[0]);
            M = int.Parse(s[1]);

            arr = new int[N];
            result = new int[M];
            visited = new bool[N + 1];

            s = Console.ReadLine().Split(' ');

            sb = new StringBuilder();
            for (int i = 0; i < N; i++)
            {
                arr[i] = int.Parse(s[i]);
            }

            Array.Sort(arr);

            cycle(0);

            Console.Write(sb);
        }

        static void cycle(int start)
        {
            
            if (start == M)
            {
                for (int i = 0; i < result.Length; i++)
                {
                    sb.Append(result[i] + " ");
                }
                sb.Append("\n");
            }
            else
            {

                for (int i = 0; i < N; i++)
                {
                    if (!visited[i])
                    {
                        visited[i] = true;
                        result[start] = arr[i];
                        cycle(start + 1);
                        visited[i] = false;
                    }
                }
            }
        }
    }
}
