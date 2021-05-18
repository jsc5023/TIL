using System;

namespace Example11720
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int sum = 0;

            string a = Console.ReadLine();
            for (int i = 0; i < n; i++)
            {
                //Console.WriteLine(a.Substring(i, 1));
                sum += int.Parse(a.Substring(i, 1));
            }

            Console.WriteLine(sum);
        }
    }
}
