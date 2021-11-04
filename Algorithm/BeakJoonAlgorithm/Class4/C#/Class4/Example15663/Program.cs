using System;
using System.Collections.Generic;
using System.Text;

namespace Example15663
{
    class Program
    {
        static int N, M;
        static int[] nums, arr;
        static bool[] visited;
        static HashSet<string> ans = new HashSet<string>();
        static StringBuilder sb;
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');
            N = int.Parse(s[0]);
            M = int.Parse(s[1]);
            nums = new int[N];
            arr = new int[M];
            visited = new bool[N];

            s = Console.ReadLine().Split(' ');
            for (int i = 0; i < N; i++)
            {
                nums[i] = int.Parse(s[i]);
            }

            sb = new StringBuilder();
            Array.Sort(nums);
            dfs(0);
            Console.Write(sb);
        }

        private static void dfs(int depth)
        {
            if (depth == M)
            {
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < M; i++)
                {
                    sb2.Append(arr[i]).Append(" ");
                }
                if (!ans.Contains(sb2.ToString()))
                {
                    sb.Append(sb2.ToString()).Append("\n");
                    ans.Add(sb2.ToString());
                }
                return;
            }
            for (int i = 0; i < N; i++)
            {
                if (!visited[i])
                {
                    visited[i] = true;
                    arr[depth] = nums[i];
                    dfs(depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
