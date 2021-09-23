using System;
using System.Collections.Generic;
using System.Text;

namespace Example17219
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int M = int.Parse(s[1]);

            Dictionary<string, string> dic = new Dictionary<string, string>();

            for (int i = 0; i < N; i++)
            {
                s = Console.ReadLine().Split(' ');

                dic.Add(s[0], s[1]);
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < M; i++)
            {
                string str = Console.ReadLine();
                sb.Append(dic[str]).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
