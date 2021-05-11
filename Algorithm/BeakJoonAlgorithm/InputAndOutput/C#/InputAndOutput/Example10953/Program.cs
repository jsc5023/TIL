using System;

namespace Example10953
{
    class Program
    {
        static void Main(string[] args)
        {
            string tstring = Console.ReadLine();

            int t = int.Parse(tstring);
            for (int i = 0; i < t; i++)
            {
                string[] s = Console.ReadLine().Split(",");

                int a = int.Parse(s[0]);
                int b = int.Parse(s[1]);

                Console.WriteLine(a + b);
            }
        }
    }
}
