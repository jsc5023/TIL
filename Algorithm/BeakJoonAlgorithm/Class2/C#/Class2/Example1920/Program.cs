using System;
using System.Text;

namespace Example1920
{
    class Program
    {
        public static int binarySearch(int[] arr, int findNum)
        {
            int left = 0, right = arr.Length - 1;

            while(left <= right)
            {
                int mid = (left + right) / 2;

                if(findNum < arr[mid])
                {
                    right = mid - 1;
                }
                else if(findNum > arr[mid])
                {
                    left = mid + 1;
                }
                else
                {
                    return 1;
                }
            }

            return 0;
        }

        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int[] arrN = new int[N];

            string[] str = Console.ReadLine().Split(' ');

            for (int i = 0; i < N; i++)
            {
                arrN[i] = int.Parse(str[i]);
            }

            Array.Sort(arrN);


            int M = int.Parse(Console.ReadLine());

            str = Console.ReadLine().Split(' ');

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++)
            {
                int findNum = int.Parse(str[i]);
                sb.Append(binarySearch(arrN, findNum)).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
