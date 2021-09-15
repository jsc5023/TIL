using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Example11866
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] str = Console.ReadLine().Split(' ');

            int N = int.Parse(str[0]);
            int K = int.Parse(str[1]);

            LinkedList<int> arrList = new LinkedList<int>();

            for (int i = 1; i <= N; i++)
            {
                arrList.AddFirst(i);
            }

            int index = -1;
            StringBuilder sb = new StringBuilder();
            sb.Append("<");
            while(arrList.Count > 0)
            {
                for (int i = 1; i < K; i++)
                {
                    int inputLast = arrList.Last.Value;
                    arrList.RemoveLast();
                    arrList.AddFirst(inputLast);
                }

                int resultLast = arrList.Last.Value;
                if(arrList.Count == 1)
                    sb.Append(resultLast).Append(">");
                else
                    sb.Append(resultLast).Append(", ");
                arrList.RemoveLast();
            }

            Console.Write(sb);
        }
    }
}
