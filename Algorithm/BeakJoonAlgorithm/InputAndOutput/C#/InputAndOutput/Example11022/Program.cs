using System;

namespace Example11022
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());

            for (int i = 1; i <= t; i++)
            {
                string[] s = Console.ReadLine().Split();

                int a = int.Parse(s[0]);
                int b = int.Parse(s[1]);
                int sum = a + b;

                Console.WriteLine("Case #" + i + ": " + a + " + " + b + " = " + sum);
            }
        }
    }
}
