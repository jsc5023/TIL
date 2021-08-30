using System;

namespace Example2839
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int result = 0;
            int cnt = 0;
            while (cnt < 5)
            {
                if(n %5 == 0 && n >= 0)
                {
                    result = (n / 5) + cnt;
                    Console.Write(result);
                    return;
                }
                n -= 3;
                cnt++;
            }

            Console.Write(-1);
        }
    }
}
