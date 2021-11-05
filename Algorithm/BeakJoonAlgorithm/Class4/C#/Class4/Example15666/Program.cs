using System;
using System.Text;

namespace Example15666
{
    class Program
    {
        static int N, M;
        static int[] arr;
        static int[] ans;
        static StringBuilder sb = new StringBuilder(); 


        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            N = int.Parse(s[0]);
            M = int.Parse(s[1]);

            s = Console.ReadLine().Split(' ');

            arr = new int[N];
            ans = new int[M];
            for (int i = 0; i < N; i++)
            {
                arr[i] = int.Parse(s[i]);
            }

            Array.Sort(arr);
            dfs(0, 0);

            Console.Write(sb);
        }

        private static void dfs(int start, int cnt)
        {

            if (cnt == M)
            {
                for (int i = 0; i < M; i++)
                {
                    sb.Append(ans[i] + " ");
                }
                sb.Append("\n");

            }
            else
            {

                int num = 0;
                for (int i = start; i < N; i++)
                {
                    if (num == arr[i]) continue;

                    ans[cnt] = arr[i];
                    dfs(i, cnt + 1);
                    num = arr[i];
                }
            }
        }
    }
}
