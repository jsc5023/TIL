using System;

namespace Example2439
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = n; i > 0; i--)
            {
                for (int j = 0; j < i - 1; j++)
                {
                    Console.Write(" ");
                }

                for (int j = i - 1; j < n; j++)
                {
                    Console.Write("*");
                }
                Console.Write("\n");
            }
        }
    }
}
