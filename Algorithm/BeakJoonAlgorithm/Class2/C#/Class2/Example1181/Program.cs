using System;
using System.Collections.Generic;

namespace Example1181
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string[] str = new string[n];
            for (int i = 0; i < n; i++)
            {
                str[i] = Console.ReadLine();
            }

            Array.Sort(str, delegate (string a, string b)
            {
                if (a.Length == b.Length)
                    return a.CompareTo(b);
                else
                    return a.Length.CompareTo(b.Length);
            });

            HashSet<string> hs = new HashSet<string>();
            for (int i = 0; i < n; i++)
            {
                hs.Add(str[i]);
            }

            foreach (var item in hs)
            {
                Console.WriteLine(item);
            }
        }
    }
}
