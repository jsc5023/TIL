using System;

namespace Example2609
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] str = Console.ReadLine().Split(' ');

            int n1 = int.Parse(str[0]);
            int n2 = int.Parse(str[1]);

            int min1 = Math.Min(n1, n2);
            int max1 = Math.Max(n1, n2);

            int resultMin = 0;

            for (int i = 1; i <= min1; i++)
            {
                if ((n1 % i == 0) && (n2 % i == 0))
                    resultMin = i;
            }

            int resultMax = (max1 / resultMin) * min1;

            Console.WriteLine(resultMin);
            Console.WriteLine(resultMax);
        }
    }
}
