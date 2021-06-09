using System;

namespace Example10818
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int max = 0;
            int min = 1000001;

            string[] innumber = Console.ReadLine().Split(' '); // 공백

            for (int i = 0; i < n; i++)
            {
                int a = int.Parse(Console.ReadLine());
                if(max < a)
                {
                    max = a;
                }

                if(min > a)
                {
                    min = a;
                }
            }
            Console.WriteLine(max);
        }
    }
}
