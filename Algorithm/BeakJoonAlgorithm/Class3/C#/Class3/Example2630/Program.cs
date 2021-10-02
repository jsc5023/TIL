using System;

namespace Example2630
{
    class Program
    {

        static int white = 0;
        static int blue = 0;
        static int[,] arr;
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            arr = new int[N, N];

            for (int i = 0; i < N; i++)
            {
                string[] s = Console.ReadLine().Split(' ');

                for (int j = 0; j < N; j++)
                {
                    arr[i,j] = int.Parse(s[j]);
                }
            }

            findColorPaper(0, 0, N);

            Console.WriteLine(white);
            Console.WriteLine(blue);
        }

        private static void findColorPaper(int row, int col, int size)
        {
            if(colorPaperCheck(row, col, size))
            {
                if (arr[row, col] == 0)
                    white++;
                else
                    blue++;
                return;
            }

            int halfSize = size / 2; // 4사분면씩으로 나누어야되므로

            findColorPaper(row, col, halfSize); // 1 사분면
            findColorPaper(row, col + halfSize, halfSize); // 2
            findColorPaper(row + halfSize, col, halfSize); // 3
            findColorPaper(row + halfSize, col + halfSize, halfSize); // 4 사분면
        }

        private static bool colorPaperCheck(int row, int col, int size)
        {
            int firstColor = arr[row, col];

            for (int i = row; i < row+size; i++)
            {
                for (int j = col; j < col+size; j++)
                {
                    if (firstColor != arr[i, j])
                        return false;
                }
            }

            return true;
        }
    }
}
