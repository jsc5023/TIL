using System;

namespace Example2522
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                for (int j = n - 1; j > i; j--)
                {
                    Console.Write(" ");
                }

                for (int j = 0; j <= i; j++)
                {
                    Console.Write("*");
                }
                Console.Write("\n");
            }

            for (int i = 0; i < n - 1; i++)
            {
                for (int j = 0; j <= i; j++)
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
