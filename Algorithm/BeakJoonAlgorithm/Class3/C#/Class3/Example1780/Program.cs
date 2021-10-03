using System;

namespace Example1780
{
    class Program
    {
        static int minusOne = 0;
        static int zero = 0;
        static int plusOne = 0;
        static int[,] paper;
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            paper = new int[N, N];

            for (int i = 0; i < N; i++)
            {
                string[] s = Console.ReadLine().Split(' ');

                for (int j = 0; j < N; j++)
                {
                    paper[i, j] = int.Parse(s[j]);
                }
            }

            findColorPaper(0, 0, N);

            Console.WriteLine(minusOne);
            Console.WriteLine(zero);
            Console.WriteLine(plusOne);
        }

        private static void findColorPaper(int row, int col, int size)
        {
            if (colorPaperCheck(row, col, size))
            {
                if (paper[row, col] == -1)
                    minusOne++;
                else if (paper[row, col] == 0)
                    zero++;
                else
                    plusOne++;
                return;
            }

            int divThreeSize = size / 3;

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    findColorPaper(row + (i * divThreeSize), col + (j * divThreeSize), divThreeSize); // 1
                }
            }
        }

        private static bool colorPaperCheck(int row, int col, int size)
        {
            int firstColor = paper[row, col];

            for (int i = row; i < row + size; i++)
            {
                for (int j = col; j < col + size; j++)
                {
                    if (firstColor != paper[i, j])
                        return false;
                }
            }

            return true;
        }
    }
}
