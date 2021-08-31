using System;

namespace Class2
{
    class Example1018
    {
        const int W = 0;
        const int B = 1;
        // 배열은 C#에서 const를 사용할 수 없다. 런타임에만 배열을 만들 수 있다.
        // 그런데 const는 런타임때는 해석이 되는 경우므로, 상수 초기화가 되지 않아서 오류가 나옵니다.
        // 그래서 읽기 전용으로 선언하는 것이다.
        static readonly int[,] boardW = { 
            { W, B, W, B, W, B, W, B },
            { B, W, B, W, B, W, B, W },
            { W, B, W, B, W, B, W, B },
            { B, W, B, W, B, W, B, W },
            { W, B, W, B, W, B, W, B },
            { B, W, B, W, B, W, B, W },
            { W, B, W, B, W, B, W, B },
            { B, W, B, W, B, W, B, W }
        };

        static readonly int[,] boardB = {
            { B, W, B, W, B, W, B, W },
            { W, B, W, B, W, B, W, B },
            { B, W, B, W, B, W, B, W },
            { W, B, W, B, W, B, W, B },
            { B, W, B, W, B, W, B, W },
            { W, B, W, B, W, B, W, B },
            { B, W, B, W, B, W, B, W },
            { W, B, W, B, W, B, W, B }
        };

        static int[,] board;
       
        static int result = 64; // 8 * 8(최대값)

        static void Main(string[] args)
        {
            string[] numstr = Console.ReadLine().Split(' ');

            int N = int.Parse(numstr[0]);
            int M = int.Parse(numstr[1]);

            board = new int[N, M];

            for (int i = 0; i < N; i++)
            {
                string str = Console.ReadLine();
                for (int j = 0; j < M; j++)
                {
                    if(str[j] == 'W')
                        board[i, j] = 0;
                    else
                        board[i, j] = 1;
                }
            }

            for (int i = 0; i <= N - 8; i++)
            {
                for (int j = 0; j <= M - 8; j++)
                {
                    compare(i, j);
                }
            }

            Console.WriteLine(result);
        }

        public static void compare(int a, int b)
        {
            int temp1 = 0, temp2 = 0;

            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    if (board[a + i, b + j] != boardW[i, j])
                    {
                        temp1++;
                    }
                    if (board[a + i, b + j] != boardB[i, j]) temp2++;
                }
            }

            result = Math.Min(result, temp1);
            result = Math.Min(result, temp2);
        }
    }
}
