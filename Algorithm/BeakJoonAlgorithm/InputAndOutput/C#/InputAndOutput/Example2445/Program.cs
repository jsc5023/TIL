using System;

namespace Example2445
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < i + 1; j++)
                {
                    Console.Write("*");
                }

                for (int j = 2 * n - 2; j > i * 2; j--)
                {
                    Console.Write(" ");
                }

                for (int j = 0; j < i + 1; j++)
                {
                    Console.Write("*");
                }
                Console.Write("\n");
            }

            for (int i = 0; i < n; i++)
            {
                for (int j = n - 1; j > i; j--)
                {
                    Console.Write("*");
                }

                for (int j = 0; j < (i+1) * 2; j++)
                {
                    Console.Write(" ");
                }

                for (int j = n - 1; j > i; j--)
                {
                    Console.Write("*");
                }

                Console.Write("\n");
            }
        }
    }
}
