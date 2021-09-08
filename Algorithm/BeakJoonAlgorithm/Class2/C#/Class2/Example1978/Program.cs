using System;

namespace Example1978
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string[] str = Console.ReadLine().Split(' ');

            int[] num = new int[1001];
            int[] inputnum = new int[n];

            num[1] = 1;
            for (int i = 1; i <= 1000; i++)
            {
                for (int j = 2; j <i; j++)
                {
                    if(i % j == 0)
                    {
                        num[i] = 1;
                        break;
                    }
                }
            }

            int cnt = 0;
            for (int i = 0; i < n; i++)
            {
                int nowNum = int.Parse(str[i]);
                if(num[nowNum] == 0)
                {
                    cnt++;
                }
            }
            Console.Write(cnt);
        }
    }
}
