using System;

namespace Example10991
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                for (int j = i; j < n-1; j++)
                {
                    Console.Write(" ");
                }

                for (int j = 0; j < ( 2 * i ) + 1; j++)
                {
                    if (j % 2 == 0)
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }

                Console.Write("\n");
            }
        }
    }
}
