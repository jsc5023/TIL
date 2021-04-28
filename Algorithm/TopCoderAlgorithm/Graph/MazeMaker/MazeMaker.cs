using System;
using System.Collections.Generic; // Queue를 쓰기 위해 사용함

namespace MazeMaker
{
    class MazeMaker
    {
        public static int longestPath(string[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol)
        {
            //너비 우선탐색이 더 좋습니다.(왜냐하면 횟수가 너무 많기 떄문에 깊이우선탐색이 효율이 나오지않기떄문입니다.)
            // 예제에 나온 코드를 참조합니다.(주석추가, 추후 새로 작성)
            int max = 0;
            int width = maze[0].Length; /*열의 값을 maze[0].Length 로 둔다*/
            int height = maze.Length; /*행의 값을 maze.Length 로 둔다*/
            int[,] board = new int[height, width]; // (maze의 빈값의 배열)

            for (int i = 0; i < height; i++)
                for (int j = 0; j < width; j++)
                    board[i, j] = -1; // 모든값을 -1로 초기화

            board[startRow, startCol] = 0;  // 시작지점을 0의 값을 가지도록 변경

            Queue<int> queueX = new Queue<int>(); // Queue를 선언한후 X축을 변경
            Queue<int> queueY = new Queue<int>(); // Queue를 선언한후 Y축을 변경
            queueX.Enqueue(startCol); // queueX 에 시작지점 Col 을 넣는다. (열)
            queueY.Enqueue(startRow); // queueY 에 시작지점 Row 을 넣는다. (행)


            while (queueX.Count > 0)
            {
                int x = queueX.Dequeue(), y = queueY.Dequeue(); // 큐에 들어있는 값을 빼낸다(첫번쨰라면 StartCol, StartRow를 의미)

                for (int i = 0; i < moveRow.Length; i++) // 움직일수 있는 행의 값만큼 반복
                {
                    int nextX = x + moveCol[i], nextY = y + moveRow[i]; // Row와 Col의 배열의 크기가 같기 때문에 이렇게 적는게 가능합니다.

                    // 다음열이 0보다 크거나 같고, 최대값이 maze[0](즉 maze의 열값)보다 커야됩니다. 마찬가지 행도 0보다 크거나 같고, 최대값이 maze.Length(maze 의 행값) 보다 커야됩니다.
                    // 그리고 board[nextY, nextX] == -1 즉, 아직 가지 않은 값이여야 하며(초기값이 -1이므로)
                    // 행의 값에 열의값(즉, 현재위치가) "." 이어야 작동합니다. 이말은 즉슨, 다음위치가 "." 즉 막혀있지 않아야 if값이 들어간다는 것입니다.
                    if (0 <= nextX && nextX < width && 0 <= nextY && nextY < height && 
                        board[nextY, nextX] == -1 && maze[nextY].Substring(nextX, 1) == ".")
                    {
                        board[nextY, nextX] = board[y, x] + 1; // board값에 +1, 즉 한번 지나갔으므로 이동한 만큼 +1을 한 값입니다.
                        queueX.Enqueue(nextX); // 그후 그값을 QueueX에 (x축 예약의 의미, 너비우선탐색특징) 넣습니다.
                        queueY.Enqueue(nextY); // 그후 그값을 QueueY에 (y축 예약의 의미, 너비우선탐색특징) 넣습니다.
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
            string[] maze = { "...", "...", "..." };
            int startRow = 0;
            int startCol = 1;
            int[] moveRow = { 1, 0, -1, 0 };
            int[] moveCol = { 0, 1, 0, -1 };
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
            Console.WriteLine(longestPath(maze, startRow, startCol, moveRow, moveCol));
        }
    }
}
