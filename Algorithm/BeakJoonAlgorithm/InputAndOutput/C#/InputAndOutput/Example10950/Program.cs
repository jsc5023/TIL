using System;

namespace Example10950
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            for (int i = 0; i < T; i++)
            {
                string[] s = Console.ReadLine().Split();

                int a = int.Parse(s[0]);
                int b = int.Parse(s[1]);

                Console.WriteLine(a + b);
            }
        }
    }
}
