using System;

namespace Example10992
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

                for (int j = 0; j < i*2 + 1; j++)
                {
                    if(n - 1 == i)
                    {
                        Console.Write("*");
                    }
                    else
                    {
                        if (j == 0)
                            Console.Write("*");
                        else if (j == i * 2)
                            Console.Write("*");
                        else
                            Console.Write(" ");
                    }
                    
                }

                Console.Write("\n");
            }
        }
    }
}
