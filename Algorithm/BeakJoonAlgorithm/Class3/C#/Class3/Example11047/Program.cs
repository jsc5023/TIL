using System;

namespace Example11047
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int K = int.Parse(s[1]);

            int[] arr = new int[N];

            for (int i = 0; i < N; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }

            int cnt = 0;
            int index = N - 1;

            while (K > 0)
            {
                if(K / arr[index] > 0)
                {
                    cnt += (K / arr[index]);
                    K %= arr[index];
                }

                index--;
            }

            Console.Write(cnt);
        }
    }
}
