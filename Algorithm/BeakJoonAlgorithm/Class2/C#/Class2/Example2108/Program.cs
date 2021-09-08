using System;

namespace Example2108
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int[] arr = new int[N];
            int[] arrFreq = new int[8001];
            for (int i = 0; i < N; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
                arrFreq[arr[i] + 4000]++;
            }

            int[] result = new int[4];
            int sum = 0;
            for (int i = 0; i < N; i++)
            {
                sum += arr[i];
            }
            result[0] = (int)Math.Round((double)sum / (double)N);

            Array.Sort(arr);
            int max = 0;
            foreach (int item in arr)
            {
                if (max < arrFreq[item + 4000])
                {
                    max = arrFreq[item + 4000];
                }
            }
            int cnt = 0;
            int maxSecondFreq = 0;
            for (int i = 0; i <= 8000; i++)
            {
                if(max == arrFreq[i])
                {
                    maxSecondFreq = i - 4000;
                    cnt++;
                    if (cnt == 2)
                    {
                        break;
                    }
                }
            }
            result[1] = arr[(N-1)/2];
            result[2] = maxSecondFreq;
            result[3] = arr[N - 1] - arr[0];

            for (int i = 0; i < 4; i++)
            {
                Console.WriteLine(result[i]);
            }
        }
    }
}
