using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Example7662
{
    class Program
    {
        static SortedDictionary<long, long> dic;
        static void Main(string[] args)
        {
            
            int T = int.Parse(Console.ReadLine());

            StringBuilder sb = new StringBuilder();
            while(T-- > 0)
            {

                dic = new SortedDictionary<long, long>();

                int K = int.Parse(Console.ReadLine());
                for (int k = 0; k < K; k++)
                {
                    string[] s = Console.ReadLine().Split(' ');

                    char cmd = s[0][0];

                    long n = long.Parse(s[1]);

                    if (cmd == 'I')
                    {
                        if (dic.ContainsKey(n))
                        {
                            dic[n] += 1;
                        }
                            
                        else dic.Add(n, 1L);
                    }
                    else if (cmd == 'D')
                    {
                        if (dic.Count == 0)
                            continue;

                        if (n == -1)
                        {
                            long minKey = dic.First().Key;
                            long next = dic[minKey] - 1;
                            if (next == 0)
                                dic.Remove(minKey);
                            else
                            {
                                dic[minKey] = next;
                            }
                                
                        }

                        else if (n == 1)
                        {
                            long maxKey = dic.Last().Key;
                            long next = dic[maxKey] - 1;
                            if (next == 0)
                                dic.Remove(maxKey);
                            else
                            {
                                dic[maxKey] = next;
                            }
                        }
                    }
                }

                if (dic.Count == 0)
                    sb.Append("EMPTY").Append("\n");
                else
                {
                    sb.Append(dic.Last().Key + " " + dic.First().Key).Append("\n");
                }
            }

            Console.Write(sb);
        }
    }
}
