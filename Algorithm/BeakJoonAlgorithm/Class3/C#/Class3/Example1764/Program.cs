using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Example1764
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int M = int.Parse(s[1]);

            HashSet<string> hs = new HashSet<string>(); 
            // Dictionary 보다 HashSet이 훨신빠르다

            ArrayList result = new ArrayList();
            for (int i = 0; i < N; i++)
            {
                hs.Add(Console.ReadLine());
            }

            for (int i = 0; i < M; i++)
            {
                string inputS = Console.ReadLine();
                if (hs.Contains(inputS))
                    result.Add(inputS);
            }

            result.Sort();

            StringBuilder sb = new StringBuilder();
            sb.Append(result.Count).Append("\n");
            for (int i = 0; i < result.Count; i++)
            {
                sb.Append(result[i]).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
