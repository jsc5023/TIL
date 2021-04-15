using System;

namespace CrazyBot
{
    class CrazyBot
    {
        // 우선 책을 참조해서 풀어나갑니다.(깊이우선탐색을 이해하기 편하게 하기  위해
        bool[,] grid = new bool[100, 100]; // 가변배열 [,]
        int[] vx = new int[4] { 1, -1, 0, 0 };
        
        public double getProbability(int n, int east, int west, int south, int north)
        {
            // 기본적으로 모든 값을 찾아야 되고, 많은 스택을 사용하지는 않으므로 깊이우선탐색으로 문제를 풀어나갑니다.
            
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
