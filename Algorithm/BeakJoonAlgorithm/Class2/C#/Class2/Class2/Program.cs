using System;

namespace Class2
{
    class Example1018
    {
        static void Main(string[] args)
        {
            string[] numstr = Console.ReadLine().Split(' ');

            int N = int.Parse(numstr[0]);
            int M = int.Parse(numstr[1]);

            char[,] board = new char[N,M];
            for (int i = 0; i < N; i++)
            {
                string str = Console.ReadLine();
                for (int j = 0; j < M; j++)
                {
                    board[i, j] = str[j];
                }
            }

            int k = 0;
        }
    }
}
