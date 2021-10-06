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

            List<List<int>> list = new List<List<int>>();
            for (int i = 0; i < N; i++)
            {
                string[] s = Console.ReadLine().Split(' ');

                list.Add(new List<int> { int.Parse(s[0]), int.Parse(s[1]) });
            }

            var orderList = list.OrderBy(x => x[1]).ThenBy(x => x[0]).ToList();
            int count = 0;
            int prev = 0;

            for (int i = 0; i < N; i++)
            {
                if (prev <= orderList[i][0])
                {
                    prev = orderList[i][1];
                    count++;
                }
            }

            Console.Write(count);

        }
    }
}
