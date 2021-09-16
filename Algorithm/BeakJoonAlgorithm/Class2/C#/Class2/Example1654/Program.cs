using System;

namespace Example1654
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');
            int K = int.Parse(s[0]);

            int N = int.Parse(s[1]);

            int[] arr = new int[K];

            long max = 0;

            for (int i = 0; i < K; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
                if (max < arr[i])
                    max = arr[i]; // 현재 랜선의 최대값을 찾아냄
            }

            max++; // max 가 0일경우 => upper_bound시 index - 1인데, 이는 -1이 나오므로
            // 오류가 발생함

            long min = 0;
            long mid = 0;

            while(min < max)
            {
                mid = (min + max) / 2;

                long count = 0;

                for (int i = 0; i < arr.Length; i++)
                {
                    count += (arr[i] / mid);
                }

                if (count < N)
                    max = mid;
                else
                    min = mid + 1;
            }

            Console.Write(min - 1);
        }
    }
}
