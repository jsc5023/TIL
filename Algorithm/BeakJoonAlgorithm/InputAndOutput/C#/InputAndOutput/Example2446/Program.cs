using System;

namespace Example2446
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    Console.Write(" ");
                }

                for (int j = 2*n - 1; j > i*2; j--)
                {
                    Console.Write("*");
                }

                Console.Write("\n");
            }

            for (int i = 0; i < n - 1; i++)
            {
                for (int j = n - 2; j > i; j--)
                {
                    Console.Write(" ");
                }

                for (int j = 0; j < (i+1) * 2 + 1; j++)
                {
                    Console.Write("*");
                }

                Console.Write("\n");
            }
        }
    }
}
