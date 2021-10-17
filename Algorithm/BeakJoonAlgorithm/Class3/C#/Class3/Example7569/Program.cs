using Example7569;
using System;
using System.Collections.Generic;

namespace Example7569
{
    class PointXYZ
    {
        int height;
        int row;
        int col;

        public PointXYZ(int height, int row, int col)
        {
            this.height = height;
            this.row = row;
            this.col = col;
        }

        public int Height { get { return height; } set { height = value; } }
        public int Row { get { return row; } set { row = value; } }
        public int Col { get { return col; } set { col = value; } }
    }

    class Program
    {
        static int[] rowArr = { -1, 0, 1, 0, 0, 0 };
        static int[] colArr = { 0, 1, 0, -1, 0, 0 };
        static int[] heightArr = { 0, 0, 0, 0, 1, -1 };
        static int M, N, H;
        static int[,,] arr;
        static Queue<PointXYZ> queue = new Queue<PointXYZ>();

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');
            M = int.Parse(s[0]);
            N = int.Parse(s[1]);
            H = int.Parse(s[2]);

            arr = new int[H + 1, N + 1, M + 1];

            for (int i = 1; i <= H; i++)
            {
                for (int j = 1; j <= N; j++)
                {
                    s = Console.ReadLine().Split(' ');
                    for (int k = 1; k <= M; k++)
                    {
                        arr[i,j,k] = int.Parse(s[k -1]);
                        if (arr[i,j,k] == 1) queue.Enqueue(new PointXYZ(i, j, k));
                    }
                }
            }

            Console.Write(bfs());
        }

        private static int bfs()
        {
            while (queue.Count > 0)
            {
                PointXYZ point = queue.Dequeue();

                int height = point.Height;
                int row = point.Row;
                int col = point.Col;

                for (int i = 0; i < 6; i++)
                {
                    int moveHeight = height + heightArr[i];
                    int moveRow = row + rowArr[i];
                    int moveCol = col + colArr[i];
                    if (checkPoint(moveHeight, moveRow, moveCol))
                    {
                        queue.Enqueue(new PointXYZ(moveHeight, moveRow, moveCol));
                        arr[moveHeight, moveRow, moveCol] = arr[height, row, col] + 1;
                    }
                }
            }
            int result = int.MinValue;

            for (int i = 1; i <= H; i++)
            {
                for (int j = 1; j <= N; j++)
                {
                    for (int k = 1; k <= M; k++)
                    {
                        if (arr[i, j, k] == 0) return -1;
                        result = Math.Max(result, arr[i, j, k]);
                    }
                }
            }
            if (result == 1) return 0;
            else return (result - 1);
        }

        private static bool checkPoint(int height, int row, int col)
        {
            if (height < 1 || height > H || row < 1 || row > N || col < 1 || col > M) return false;
            if (arr[height, row, col] == 0) return true;
            else return false;
        }
    }
}
