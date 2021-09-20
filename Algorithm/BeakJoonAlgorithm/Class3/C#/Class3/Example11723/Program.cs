using System;
using System.Collections.Generic;
using System.Text;

namespace Example11723
{
    class Program
    {
        static void Main(string[] args)
        {
            int M = int.Parse(Console.ReadLine());

            HashSet<int> set = new HashSet<int>();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++)
            {
                string[] s = Console.ReadLine().Split(' ');

                switch (s[0])
                {
                    case "add":
                        set.Add(int.Parse(s[1]));
                        break;

                    case "remove":
                        set.Remove(int.Parse(s[1]));
                        break;

                    case "check":
                        if (set.Contains(int.Parse(s[1])))
                            sb.Append("1").Append("\n");
                        else
                            sb.Append("0").Append("\n");
                        break;

                    case "toggle":
                        if (set.Contains(int.Parse(s[1])))
                            set.Remove(int.Parse(s[1]));
                        else
                            set.Add(int.Parse(s[1]));
                        break;

                    case "all":
                        for (int j = 1; j <= 20; j++)
                        {
                            set.Add(j);
                        }
                        break;

                    case "empty":
                        set = new HashSet<int>();
                        break;
                }
            }

            Console.Write(sb);
        }
    }
}
