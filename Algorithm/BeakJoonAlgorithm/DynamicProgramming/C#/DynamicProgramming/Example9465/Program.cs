using System;

namespace Example9465
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());
            int[,] startDp = new int[2, 100001];
            int[,] resultDp = new int[3, 1000002];

            for (int i = 0; i < T; i++)
            {
                int n = int.Parse(Console.ReadLine());

                string[] firstRowString = Console.ReadLine().Split(' ');
                for (int j = 0; j < firstRowString.Length; j++)
                    startDp[0, j] = int.Parse(firstRowString[j]);

                string[] secondRowString = Console.ReadLine().Split(' ');
                for (int j = 0; j < secondRowString.Length; j++)
                    startDp[1, j] = int.Parse(secondRowString[j]);

                resultDp[1, 1] = startDp[0, 0];
                resultDp[2, 1] = startDp[1, 0];

                for (int j = 2; j <= n; j++)
                {
                    resultDp[0, j - 1] = Math.Max(resultDp[1, j - 2], resultDp[2, j - 2]);
                    resultDp[1,j] = Math.Max(resultDp[0, j - 1], resultDp[2, j - 1]) + startDp[0, j - 1];
                    resultDp[2, j] = Math.Max(resultDp[0, j - 1], resultDp[1, j - 1]) + startDp[1, j - 1];
                }

                Console.WriteLine(Math.Max(resultDp[1, n], resultDp[2, n]));
            }
        }
    }
}
