using System;

namespace Example1149
{
    class Program
    {
        static int red = 0;
        static int green = 1;
        static int blue = 2;

        static int[,] cost;
        static int[,] arr;
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            cost = new int[N, 3];
            arr = new int[N, 3];
            for (int i = 0; i < N; i++)
            {
                string[] s = Console.ReadLine().Split(' ');

                cost[i, red] = int.Parse(s[0]);
                cost[i, green] = int.Parse(s[1]);
                cost[i, blue] = int.Parse(s[2]);
            }

            arr[0, red] = cost[0, red];
            arr[0, green] = cost[0, green];
            arr[0, blue] = cost[0, blue];

            int result = Math.Min(cost_Color(N - 1, red), cost_Color(N - 1, green));
            result = Math.Min(result, cost_Color(N - 1, blue));

            Console.Write(result);

        }

        static int cost_Color(int N, int color)
        {
            if (arr[N, color] == 0)
            {
                if (color == red)
                {
                    arr[N, red] = Math.Min(cost_Color(N - 1, green), cost_Color(N - 1, blue)) + cost[N, red];
                }
                else if (color == green)
                {
                    arr[N, green] = Math.Min(cost_Color(N - 1, red), cost_Color(N - 1, blue)) + cost[N, green];
                }
                else
                {
                    arr[N, blue] = Math.Min(cost_Color(N - 1, red), cost_Color(N - 1, green)) + cost[N, blue];
                }

            }

            return arr[N, color];
        }
    }
}
