using System;
using System.Collections.Generic;
using System.Text;

namespace Example1012
{
    class Program
    {
        static int[] dx = { -1, 0, 1, 0 }; 
        static int[] dy = { 0, 1, 0, -1 };

        // dx dy 합쳐서 좌 하 우 상 순서
        static int[,] visited;
        static int[,] arr;

        static int M;
        static int N;
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            StringBuilder sb = new StringBuilder();
            while(T-- > 0)
            {
                string[] s = Console.ReadLine().Split(' ');

                M = int.Parse(s[0]);
                N = int.Parse(s[1]);
                int K = int.Parse(s[2]);

                arr = new int[N, M];
                visited = new int[N, M];

                for (int i = 0; i < K; i++)
                {
                    s = Console.ReadLine().Split(' ');
                    arr[int.Parse(s[1]), int.Parse(s[0])] = 1;
                }

                int cnt = 0;

                for (int i = 0; i < N; i++)
                {
                    for (int j = 0; j < M; j++)
                    {
                        if (arr[i, j] != 0)
                        {
                            dfs(i, j);
                            //배추 수확
                            cnt++;
                        }
                    }
                }

                sb.Append(cnt).Append("\n");
            }
            Console.Write(sb);
        }

        private static void dfs(int X, int Y)
        {
            for (int i = 0; i < 4; i++)
            {
                // 다음것
                int nextX = X + dx[i];
                int nextY = Y + dy[i];

                // 다음 X 또는 Y의 범위가 배열의 범위(세로, 가로)를 벗어나면 continue
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                {
                    continue;
                }
                
                // 방문한 경우 0으로 변경되어있으므로(다음코드에서 방문한점을 0으로 변경)
                // 0일경우 continue
                if (arr[nextX, nextY] == 0)
                {
                    continue;
                }
                
                // 방문 -> 0으로변경
                arr[nextX, nextY] = 0;
                dfs(nextX, nextY);
            }
        }
    }
}
