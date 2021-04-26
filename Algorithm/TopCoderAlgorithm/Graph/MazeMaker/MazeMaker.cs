using System;

namespace MazeMaker
{
    class MazeMaker
    {
        public int longestPath(string[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol)
        {
            //너비 우선탐색이 더 좋습니다.(왜냐하면 횟수가 너무 많기 떄문에 깊이우선탐색이 효율이 나오지않기떄문입니다.)
            int max = 0;
            int width = maze[0];
        }

        static void Main(string[] args)
        {
            // Example 1
            //string[] maze = { "...", "...", "..." };
            //int startRow = 0;
            //int startCol = 1;
            //int[] moveRow = { 1, 0, -1, 0 };
            //int[] moveCol = { 0, 1, 0, -1 };
            //return 3;

            // Example 2
            //string[] maze = { "...", "...", "..." };
            //int startRow = 0;
            //int startCol = 1;
            //int[] moveRow = { 1, 0, -1, 0, 1, 1, -1, -1 };
            //int[] moveCol = { 0, 1, 0, -1 , 1, -1, 1, -1};
            //return 2

            // Example 3
            //string[] maze = { "X.X",
            //                  "...",
            //                  "XXX",
            //                  "X.X"};
            //int startRow = 0;
            //int startCol = 1;
            //int[] moveRow = { 1, 0, -1, 0 };
            //int[] moveCol = { 0, 1, 0, -1};
            //return -1;

            // Example 2
            Console.WriteLine("Hello World!");
        }
    }
}
