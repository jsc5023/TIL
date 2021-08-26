using System;

namespace Example11085
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] str = Console.ReadLine().Split(' ');

            int x = int.Parse(str[0]);
            int y = int.Parse(str[1]);
            int w = int.Parse(str[2]);
            int h = int.Parse(str[3]);

            int min = Math.Min(x - 0, w - x);
            min = Math.Min(min, y - 0);
            min = Math.Min(min, h - y);

            Console.Write(min);
        }
    }
}
