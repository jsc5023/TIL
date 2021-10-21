using System;
using System.Collections.Generic;

namespace Example16928
{
    class Program
    {
        static int[] board = new int[101];
        static Dictionary<int, int> dic = new Dictionary<int, int>();

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int M = int.Parse(s[1]);


            for (int i = 0; i < N; i++)
            {
                s = Console.ReadLine().Split(' ');

                int x = int.Parse(s[0]);
                int y = int.Parse(s[1]);

                dic.Add(x, y);
            }

            for (int i = 0; i < M; i++)
            {
                s = Console.ReadLine().Split(' ');

                int x = int.Parse(s[0]);
                int y = int.Parse(s[1]);

                dic.Add(x, y);
            }

            int cnt = find_DiceCount();
            Console.Write(cnt);
        }

        private static int find_DiceCount()
        {
            int cnt = 0;
            bool[] visit = new bool[101];
            Queue<int> queue = new Queue<int>();

            visit[1] = true;
            queue.Enqueue(1);

            while(queue.Count > 0)
            {
                int size = queue.Count; // 현재사이즈

                for (int i = 0; i < size; i++)
                {
                    int currentLocation = queue.Dequeue();

                    if (currentLocation == 100)
                        return cnt;

                    for (int j = 1; j <= 6; j++)
                    {
                        int nextLocation = currentLocation + j;

                        if (nextLocation > 100)
                            break;

                        if (visit[nextLocation])
                            continue;

                        if (dic.ContainsKey(nextLocation))
                        {
                            nextLocation = dic[nextLocation];
                            if (visit[nextLocation])
                                continue;
                        }

                        queue.Enqueue(nextLocation);
                        visit[nextLocation] = true;
                    }
                }
                cnt++;
            }

            return cnt;
        }
    }
}
