using System;
using System.Collections.Generic;
using System.Text;

namespace Example9375
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            StringBuilder sb = new StringBuilder();

            while(T-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                Dictionary<string, int> dic = new Dictionary<string, int>();

                for (int i = 0; i < n; i++)
                {
                    string[] s = Console.ReadLine().Split(' ');

                    if (dic.ContainsKey(s[1]))
                        dic[s[1]] = dic[s[1]] + 1;
                    else
                        dic.Add(s[1], 1);
                }

                int cnt = 1;

                // 첫 TestCase기준 - (headgear, 2), (eyewear, 1)
                foreach (int item in dic.Values)
                {
                    cnt = cnt * (item + 1); // 옷을 안입는 경우 때문에 +1
                }

                sb.Append(cnt - 1).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
