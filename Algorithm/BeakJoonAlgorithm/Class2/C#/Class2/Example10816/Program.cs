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

            // lo가 hi랑 같아질 때 까지 반복
            while (lo < hi)
            {

                int mid = (lo + hi) / 2; // 중간위치를 구한다.

                /*
                 *  key 값이 중간 위치의 값보다 작거나 같을 경우
                 *  
                 *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
                 */
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

            // lo가 hi랑 같아질 때 까지 반복
            while (lo < hi)
            {

                int mid = (lo + hi) / 2; // 중간위치를 구한다.

                // key값이 중간 위치의 값보다 작을 경우
                if (key < arr[mid])
                {
                    hi = mid;
                }
                // 중복원소의 경우 else에서 처리된다.
                else
                {
                    lo = mid + 1;
                }

            }

            return lo;
        }
    }
}
