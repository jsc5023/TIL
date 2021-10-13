using System;
using System.Text;
namespace Example1992
{
    class Program
    {
        static int[,] img;
        static StringBuilder sb = new StringBuilder();
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            img = new int[N, N];

            for (int i = 0; i < N; i++)
            {
                string str = Console.ReadLine();

                for (int j = 0; j < N; j++)
                {
                    img[i, j] = str[j] - '0';
                }
            }

            quadTree(0, 0, N);

            Console.Write(sb);

        }

        private static void quadTree(int x, int y, int size)
        {
            if (isPossible(x, y, size))
            {
                sb.Append(img[x, y]);
                return;
            }

            int newSize = size / 2;

            sb.Append("(");

            quadTree(x, y, newSize);
            quadTree(x, y + newSize, newSize); 
            quadTree(x + newSize, y, newSize);
            quadTree(x + newSize, y + newSize, newSize);

            sb.Append(")");
        }

        private static bool isPossible(int x, int y, int size)
        {
            int value = img[x, y];

            for (int i = x; i < x + size; i++)
            {
                for (int j = y; j < y + size; j++)
                {
                    if (value != img[i, j])
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
