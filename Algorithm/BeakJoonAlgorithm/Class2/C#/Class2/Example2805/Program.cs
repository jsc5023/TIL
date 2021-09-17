using System;

namespace Example2805
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int M = int.Parse(s[1]);

            int[] arr = new int[N];

            long max = 0;

            s = Console.ReadLine().Split(' ');
            for (int i = 0; i < N; i++)
            {
                arr[i] = int.Parse(s[i]);
                if (max < arr[i])
                    max = arr[i];
            }

            max++;

            long min = 0;
            long mid = 0;
            while(min < max)
            {
                mid = (min + max) / 2;

                long cnt = 0;

                for (int i = 0; i < N; i++)
                {
                    if (arr[i] > mid)
                        cnt += (arr[i] - mid);
                }

                if (cnt >= M)
                    min = mid + 1;
                else
                    max = mid;
            }

            Console.Write(min - 1);
        }
    }
}
