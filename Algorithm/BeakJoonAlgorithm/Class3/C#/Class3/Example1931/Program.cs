using System;
using System.Collections.Generic;
using System.Linq;
namespace Example1931
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int[][] arr = new int[N][];

            for (int i = 0; i < N; i++)
            {
                string[] s = Console.ReadLine().Split(' ');

                arr[i][0] = int.Parse(s[0]);
                arr[i][1] = int.Parse(s[1]);
            }

            //IOrderedEnumerable<int[]> sortedByFirst = arr.OrderBy(y => y[0]);
            IOrderedEnumerable<int[]> sortedBySecond = arr.OrderBy(y => y[1]);

            int[][] sortedArray = sortedBySecond.ToArray();

            int count = 0;
            int prev_end_time = 0;

            for (int i = 0; i < N; i++)
            {
                if (prev_end_time <= arr[i][0])
                {
                    prev_end_time = arr[i][1];
                    count++;
                }
            }

            Console.Write(count);

        }
    }
}
