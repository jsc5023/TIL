using System;

namespace Example2292
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int result = 0;
            int sum = 1;
            if (N == 1){
                result = 1;
                Console.Write(result);
                return;
            }
                
            int i = 0;

            while (true)
            {
                i++;
                sum += i * 6;
                if (sum >= N)
                {
                    result = i + 1;
                    break;
                }
            }

            Console.Write(result);
        }
    }
}
