using System;
using System.Text;

namespace Example10989
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int[] arr = new int[10001];
            for (int i = 0; i < N; i++)
            {
                arr[int.Parse(Console.ReadLine())]++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < 10001; i++)
            {
                if(i % 100 == 0)
                {
                    Console.Write(sb);
                    sb = new StringBuilder();
                }
                while (arr[i] > 0)
                {
                    sb.Append(i).Append("\n");
                    arr[i]--;
                }
            }
        }
    }
}
