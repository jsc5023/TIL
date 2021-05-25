using System;

namespace Example2739
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 1; i <= 9; i++)
            {

                Console.WriteLine(n + " * " + i + " = " + n * i);
            }
        }
    }
}
