using System;
using System.Collections.Generic;
using System.Text;

namespace Example18870
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            string[] s = Console.ReadLine().Split(' ');

            int[] nums = new int[N];
            for (int i = 0; i < N; i++)
                nums[i] = int.Parse(s[i]);

            int[] sortNums = (int[])nums.Clone();
            Array.Sort(sortNums);

            Dictionary<int, int> dic = new Dictionary<int, int>();
            int idx = 0;
            foreach (var item in sortNums)
            {
                if (!dic.ContainsKey(item))
                    dic.Add(item, idx++);
            }
                
            StringBuilder sb = new StringBuilder();
            foreach (var item in nums)
            {
                sb.Append(dic[item]).Append(" ");
            }

            Console.Write(sb);
        }
    }
}
