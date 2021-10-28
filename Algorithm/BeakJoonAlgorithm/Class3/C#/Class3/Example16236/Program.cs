using System;
using System.Collections.Generic;

namespace Example16236
{
    class Program
    {
        static int N;
        static int[,] space;
        static int babySharkSize = 2;
        static int cnt = 0;
        static bool[,] visited;
        static int[,] dist;
        static int minX = 0;
        static int minY = 0;
        static int minDist = 0;
        static int eatingCount = 0;
        static int[] dx = { 0, 0, -1, 1 };
        static int[] dy = { 1, -1, 0, 0 };

        static void Main(string[] args)
        {
            N = int.Parse(Console.ReadLine());

            space = new int[N + 1, N + 1];
            visited = new bool[N + 1, N + 1];
            int babyShark_X = 0;
            int babyShark_Y = 0;
            for (int i = 1; i <= N; i++)
            {
                string[] s = Console.ReadLine().Split(' ');
                for (int j = 1; j <= N; j++)
                {
                    int num = int.Parse(s[j-1]);
                    space[i,j] = int.Parse(s[j-1]);

                    if(num == 9)
                    {
                        babyShark_Y = i;
                        babyShark_X = j;
                    }
                }
            }

            while (true)
            {
                dist = new int[N + 1, N + 1];
                minX = int.MaxValue;
                minY = int.MaxValue;
                minDist = int.MaxValue;

                bfs(babyShark_Y, babyShark_X);

                if (minX != int.MaxValue && minY != int.MaxValue)
                {
                    eatingCount++;
                    space[minY, minX] = 0;
                    babyShark_Y = minY;
                    babyShark_X = minX;
                    cnt += dist[minY, minX];

                    if (eatingCount == babySharkSize)
                    {
                        babySharkSize++;
                        eatingCount = 0;
                    }
                }
                else
                {
                    break;
                }
            }
            Console.Write(cnt);
        }

        private static void bfs(int babyShark_Y, int babyShark_X)
        {
            Queue<int[]> queue = new Queue<int[]>();

            int[] arr = { babyShark_Y, babyShark_X };

            queue.Enqueue(arr);

            while(queue.Count > 0)
            {
                arr = queue.Dequeue();

                for (int i = 0; i < 4; i++)
                {
                    int nextY = arr[0] + dy[i];
                    int nextX = arr[1] + dx[i];

                    if (isInArea(nextY, nextX) && isAbleToMove(nextY, nextX) && dist[nextY, nextX] == 0)
                    {
                        dist[nextY, nextX] = dist[arr[0], arr[1]] + 1;

                        if (isEatable(nextY, nextX))
                        {
                            if (minDist > dist[nextY, nextX])
                            {
                                minDist = dist[nextY, nextX];
                                minY = nextY;
                                minX = nextX;
                            }
                            else if (minDist == dist[nextY, nextX])
                            {
                                if (minY == nextY)
                                {
                                    if (minX > nextX)
                                    {
                                        minY = nextY;
                                        minX = nextX;
                                    }
                                }
                                else if (minY > nextY)
                                {
                                    minY = nextY;
                                    minX = nextX;
                                }
                            }
                        }

                        queue.Enqueue(new int[] { nextY, nextX });
                    }
                }
            }

            return;
        }

        private static bool isAbleToMove(int y, int x)
        {
            return space[y, x] <= babySharkSize;
        }

        private static bool isEatable(int y, int x)
        {
            return space[y, x] != 0 && space[y, x] < babySharkSize;
        }

        private static bool isInArea(int y, int x)
        {
            return x <= N && x > 0 && y <= N && y > 0;
        }
    }
}
