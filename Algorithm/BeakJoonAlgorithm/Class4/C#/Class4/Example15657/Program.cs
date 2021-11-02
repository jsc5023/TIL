using System;
using System.Text;

namespace Example15657
{
    class Program
    {
        static int N, M;
        static int[] arr;
        static int[] result;
        public static StringBuilder sb;

        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            N = int.Parse(s[0]);
            M = int.Parse(s[1]);

            arr = new int[N];
            result = new int[M];

            s = Console.ReadLine().Split(' ');
            for (int i = 0; i < N; i++)
            {
                arr[i] = int.Parse(s[i]);
            }

            Array.Sort(arr);
            sb = new StringBuilder();

            cycle(0, 0);

            Console.Write(sb);
        }

        public static void cycle(int depth, int index)
        {
            if (depth == M)
            {
                foreach (var item in result)
                {
                    sb.Append(item + " ");
                }
                sb.Append("\n");
                return;
            }
            for (int i = index; i < N; i++)
            {
                result[depth] = arr[i];
                cycle(depth + 1, i);
            }
        }
    }
}
