using System;

namespace Example7568
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[,] xy = new int[2,n];
            int[] result = new int[n];
            for (int i = 0; i < n; i++)
            {
                string[] str = Console.ReadLine().Split(' ');
                xy[0,i] = int.Parse(str[0]);
                xy[1,i] = int.Parse(str[1]);
                result[i] = 1;
            }

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (xy[0, i] < xy[0, j] && xy[1, i] < xy[1, j])
                      result[i]++;
                }
            }
            for (int i = 0; i < n; i++)
            {
                Console.Write(result[i] + " ");
            }
            Console.WriteLine();
        }
    }
}
