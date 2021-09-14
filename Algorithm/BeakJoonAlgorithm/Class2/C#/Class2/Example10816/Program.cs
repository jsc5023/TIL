using System;
using System.Text;

namespace Example10816
{
    class Program
    {

        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int[] arr = new int[N];

            string[] str = Console.ReadLine().Split(' ');
            for (int i = 0; i < N; i++)
            {
                arr[i] = int.Parse(str[i]);
            }

            Array.Sort(arr);

            int M = int.Parse(Console.ReadLine());

            StringBuilder sb = new StringBuilder();

            str = Console.ReadLine().Split(' ');
            for (int i = 0; i < M; i++)
            {
                int key = int.Parse(str[i]);

                sb.Append(upperBound(arr, key) - lowerBound(arr, key)).Append(' ');
            }
            Console.Write(sb);
        }

        static int lowerBound(int[] arr, int key)
        {
            int lo = 0;
            int hi = arr.Length;

            while (lo < hi)
            {

                int mid = (lo + hi) / 2;

                if (key <= arr[mid])
                {
                    hi = mid;
                }

                else
                {
                    lo = mid + 1;
                }

            }

            return lo;
        }

        static int upperBound(int[] arr, int key)
        {
            int lo = 0;
            int hi = arr.Length;

            while (lo < hi)
            {

                int mid = (lo + hi) / 2;

                if (key < arr[mid])
                {
                    hi = mid;
                }

                else
                {
                    lo = mid + 1;
                }

            }

            return lo;
        }
    }
}
