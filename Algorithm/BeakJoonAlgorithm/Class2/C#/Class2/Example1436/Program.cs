using System;

namespace Example1436
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int cnt = 1;
            int number = 666;
            while(N > cnt)
            {
                number++;
                if(number.ToString().Contains("666"))
                    cnt++;
            }
            System.Console.Write(number);
        }
    }
}
