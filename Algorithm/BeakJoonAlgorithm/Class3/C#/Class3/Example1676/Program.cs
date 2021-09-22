using System;

namespace Example1676
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int cnt2 = 0;
            int cnt5 = 0;
            int result = 0;
            for (int i = N; i > 0; i--)
            {
                int temp = i;
                while (temp > 0)
                {
                    if (temp % 2 == 0)
                        cnt2++;
                    else
                        break;
                    temp /= 2;
                }

                temp = i;

                while (temp > 0)
                {
                    if (temp % 5 == 0)
                        cnt5++;
                    else
                        break;
                    temp /= 5;
                }
            }

            result = Math.Min(cnt2, cnt5);
            Console.Write(result);
        }
    }
}
