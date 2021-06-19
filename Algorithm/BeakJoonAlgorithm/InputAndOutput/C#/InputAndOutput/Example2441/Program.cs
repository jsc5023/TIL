using System;

namespace Example2441
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

                for (int j = n; j > i; j--)
                {
                    Console.Write("*");
                }

                Console.Write("\n");
            }
        }
    }
}
