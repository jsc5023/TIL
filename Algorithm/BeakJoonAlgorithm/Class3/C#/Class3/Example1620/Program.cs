using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Example1620
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int M = int.Parse(s[1]);

            StringBuilder sb = new StringBuilder();

            Dictionary<string, string> dic = new Dictionary<string, string>();
            for (int i = 1; i <= N; i++)
            {
                string poketmon = Console.ReadLine();
                string num = i.ToString();
                dic.Add(poketmon, num);
                dic.Add(num, poketmon);
            }

            for (int i = 0; i < M; i++)
            {
                string input = Console.ReadLine();

                sb.Append(dic[input]).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
