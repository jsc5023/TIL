using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Example11279
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine()); // C#은 우선순위 큐가 없음 -> 구현해야됨
            //LinkedList<int> ls = new LinkedList<int>();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++)
            {
                int x = int.Parse(Console.ReadLine());
                if (x == 0)
                {
                    if (list.Count == 0)
                        sb.Append(0).Append("\n");
                    else
                    {
                        int[] a = (int[])list.ToArray(typeof(int));
                        Array.Sort(a);
                        sb.Append(a[a.Length - 1]).Append("\n");
                        list.Remove(a[a.Length - 1]);
                    }
                }
                else
                    list.Add(x);
            }

            Console.Write(sb);
        }
    }
}
