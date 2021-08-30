using System;

namespace Example2869
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] str = Console.ReadLine().Split(' ');

            double A = double.Parse(str[0]);
            double B = double.Parse(str[1]);
            double V = double.Parse(str[2]);

            double result = 0;
            double diff = A - B;

            result = Math.Ceiling((V - A) / diff) + 1;

            Console.Write(result);
            
        }
    }
}
