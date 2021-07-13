using System;

namespace Example1463
{
    class Program
    {
        static void Main(string[] args)
        {
            // 문제 풀이 방법 - 작은문제를 먼저 풀고, 그후 순차적으로 수행해 나간다.

            int X = int.Parse(Console.ReadLine());
            int[] dp = { 0, };

            while(X != 1)
            {
                if (X % 3 == 0)
                {
                    X = X / 3;
                    count += 1;
                }  
                else if (X % 2 == 0)
                {
                    X = X / 2;
                    count += 1;
                }
                else
                {
                    X = X - 1;
                    count += 1;
                } 
            }

            Console.Write(count);
        }
    }
}
