using System;
using System.Text;

namespace Example11403
{
    class Program
    {
        static int[,] map;
        static int[,] resultMap;
        static bool[,] visit;
        static int N;
        static void Main(string[] args)
        {
            N = int.Parse(Console.ReadLine());

            map = new int[N, N];
            resultMap = new int[N, N];
            visit = new bool[N, N];
            for (int i = 0; i < N; i++)
            {
                string[] s = Console.ReadLine().Split(' ');

                for (int j = 0; j < N; j++)
                {
                    map[i, j] = int.Parse(s[j]);
                }
            }

            // k = 거쳐가는 노드
            for (int k = 0; k < N; k++)
            {
                // i = 출발 노드
                for (int i = 0; i < N; i++)
                {
                    // j = 도착 노드
                    for (int j = 0; j < N; j++)
                    {
                        if (map[i, k] == 1 && map[k, j] == 1)
                        {
                            map[i, j] = 1;
                        }
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    sb.Append(map[i, j] + " ");
                }
                sb.Append("\n");
            }

            Console.Write(sb);
        }
    }
}
