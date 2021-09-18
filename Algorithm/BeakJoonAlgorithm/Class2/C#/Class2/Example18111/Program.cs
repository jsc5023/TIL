using System;

namespace Example18111
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int M = int.Parse(s[1]);
            int B = int.Parse(s[2]);

            int[,] ground = new int[N, M];

            int max = 0;
            int min = 501;
            for (int i = 0; i < N; i++)
            {
                s = Console.ReadLine().Split(' ');
                for (int j = 0; j < M; j++)
                {
                    int val = int.Parse(s[j]);
                    ground[i, j] = val;

                    max = Math.Max(max, val);
                    min = Math.Min(min, val);
                }

            }

            int minSec = int.MaxValue; // 시간
            int resHi = int.MinValue; // 층

            for (int i = min; i <= max; i++)
            { // 최소층 부터 최대층 까지

                int seconds = 0;
                int inventory = B;

                for (int j = 0; j < N; j++)
                {
                    for (int k = 0; k < M; k++)
                    {
                        int diff = ground[j,k] - i;

                        if (diff > 0)
                        { // 제거해야 함
                            seconds += Math.Abs(diff) * 2;
                            inventory += Math.Abs(diff);
                        }
                        else if (diff < 0)
                        { // 추가해야 함
                            seconds += Math.Abs(diff);
                            inventory -= Math.Abs(diff);
                        }
                    }
                }

                if (inventory >= 0)
                {
                    if (seconds <= minSec)
                    { // 같은값도 포함해야됩니다.
                        minSec = seconds;
                        resHi = i;
                    }
                }
            }

            Console.Write(minSec + " " + resHi);
        }
    }
}
