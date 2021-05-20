using System;

namespace Example11721
{
    class Program
    {
        static void Main(string[] args)
        {
            string a = Console.ReadLine();

            while (true)
            {
                if(a.Length >= 10)
                {
                    Console.WriteLine(a.Substring(0, 10));
                }
                else
                {
                    Console.WriteLine(a.Substring(0, a.Length));
                    break;
                }

                a = a.Substring(10, a.Length - 10);
            }
        }
    }
}
