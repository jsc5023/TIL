using System;
using System.Collections.Generic; // Queue를 쓰기 위해 사용함

namespace MazeMaker
{
    class MazeMaker
    {
        public int longestPath(string[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol)
        {
            //너비 우선탐색이 더 좋습니다.(왜냐하면 횟수가 너무 많기 떄문에 깊이우선탐색이 효율이 나오지않기떄문입니다.)
            // 예제에 나온 코드를 참조합니다.(주석추가, 추후 새로 작성)
            int max = 0;
            int width = maze[0].Length, height = maze.Length;
            int[,] board = new int[height, width];

            for (int i = 0; i < height; i++)
                for (int j = 0; j < width; j++)
                    board[i, j] = -1;

            board[startRow, startCol] = 0;

            Queue<int> queueX = new Queue<int>();
            Queue<int> queueY = new Queue<int>();
            queueX.Enqueue(startCol);
            queueY.Enqueue(startRow);


            while (queueX.Count > 0)
            {
                int x = queueX.Dequeue(), y = queueY.Dequeue();

                for (int i = 0; i < moveRow.Length; i++)
                {
                    int nextX = x + moveCol[i], nextY = y + moveRow[i];

                    if (0 <= nextX && nextX < width && 0 <= nextY && nextY < height && board[nextY, nextX] == -1 && maze[nextY].Substring(nextX, 1) == ".")
                    {
                        board[nextY, nextX] = board[y, x] + 1;
                        queueX.Enqueue(nextX);
                        queueY.Enqueue(nextY);
                    }
                }
            }

            for (int i = 0; i < height; i++)
            {
                for (int j = 0; j < width; j++)
                {
                    if (maze[i].Substring(j, 1) == "." && board[i, j] == -1)
                        return -1;
                    max = Math.Max(max, board[i, j]);
                }
            }

            return max;

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
