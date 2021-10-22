using System;

namespace Example1107
{
    class Program
    {
        static bool[] broken = new bool[10]; // 리모컨의 부서진 자리수

        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            int M = int.Parse(Console.ReadLine());

            if(M != 0)
            {
                string[] s = Console.ReadLine().Split(' ');
                for (int i = 0; i < M; i++)
                {
                    int brokenNum = int.Parse(s[i]);
                    broken[brokenNum] = true;
                }
            }

            int ans = Math.Abs(N - 100);

            for (int i = 0; i <= 1000000; i++)
            {
                int len = possible(i);
                
                if (len > 0)
                {
                    int press = Math.Abs(i - N);
                    ans = Math.Min(ans, len + press);
                }
            }

            Console.Write(ans);
        }

        static int possible(int n)
        {
            if (n == 0)
            {
                if (broken[0])
                {
                    return 0;
                }
                else
                {
                    return 1;
                }
            }
            int len = 0;
            while (n > 0)
            {
                if (broken[n % 10])
                { 
                    return 0;
                }
                n /= 10;
                len += 1;
            }
            return len;
        }
    }
}
