using System;

namespace Example1000
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split();
            int a = int.Parse(s[0]);
            int b = int.Parse(s[1]);
            Console.WriteLine(a+b);
        }
    }
}
