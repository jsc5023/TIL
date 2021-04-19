using System;

namespace CrazyBot
{
    class CrazyBot
    {
        // 우선 책을 참조해서 풀어나갑니다.(깊이우선탐색을 이해하기 편하게 하기  위해
        bool[,] grid = new bool[100, 100];
        int[] vx = new int[4] { 1, -1, 0, 0 };
        int[] vy = new int[4] { 0, 0, 1, -1 };
        double[] prob = new double[4];

        public double getProbability(int n, int east, int west, int south, int north)
        {
            // 기본적으로 모든 값을 찾아야 되고, 많은 스택을 사용하지는 않으므로 깊이우선탐색으로 문제를 풀어나갑니다.
            prob[0] = east / 100.0;
            prob[1] = west / 100.0;
            prob[2] = south / 100.0;
            prob[3] = north / 100.0;

            return dfs(50, 50, n);
        }

        double dfs(int x, int y, int n)
        {
            if (grid[x, y]) return 0;
            if (n == 0) return 1;

            grid[x, y] = true;
            double ret = 0;
            for (int i = 0; i < 4; i++)
            {
                // east, west, south, north 순서로 로봇을 움직입니다.
                ret += dfs(x + vx[i], y + vy[i], n - 1) * prob[i];
            }

            grid[x, y] = false;

            return ret;
        }

        static void Main(string[] args)
        {
            // Example 1
            //int n = 1;
            //int east = 25;
            //int west = 25;
            //int south = 25;
            //int north = 25;
            //return : 10

            // Example 2
            int n = 2;
            int east = 25;
            int west = 25;
            int south = 25;
            int north = 25;
            //return : 0.75;

            // Example 3
            //int n = 7;
            //int east = 50;
            //int west = 0;
            //int south = 0;
            //int north = 50;
            //return 1.0;
            //Console.WriteLine(getProbability(n, east, west, south, north);
        }
    }
}
