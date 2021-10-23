using System;
using System.Collections.Generic;
using System.Text;

namespace Example5430
{
    class Program
    {
        public static StringBuilder sb = new StringBuilder();

        static void Main(string[] args)
        {
            LinkedList<int> deque;

            int T = int.Parse(Console.ReadLine());

            while (T-- > 0)
            {
                string command = Console.ReadLine();
                int n = int.Parse(Console.ReadLine());

                string str = Console.ReadLine();
                string[] s = str.Substring(1, str.Length - 2).Split(',');

                deque = new LinkedList<int>();

                for (int i = 0; i < n; i++)
                {
                    deque.AddLast(int.Parse(s[i]));
                }

                AC(command, deque);
            }

            Console.Write(sb);
        }

        private static void AC(string command, LinkedList<int> deque)
        {
            bool isRight = true;

            foreach (char cmd in command.ToCharArray())
            {
                if (cmd == 'R')
                {
                    isRight = !isRight;
                    continue;
                }

                if (isRight)
                {
                    if (deque.First == null)
                    {
                        sb.Append("error\n");
                        return;
                    }
                    else
                    {
                        deque.RemoveFirst();
                    }
                }
                else
                {
                    if (deque.Last == null)
                    {
                        sb.Append("error\n");
                        return;
                    }
                    else
                    {
                        deque.RemoveLast();
                    }
                }
            }
            makePrintString(deque, isRight);

        }

        public static void makePrintString(LinkedList<int> deque, bool isRight)
        {

            sb.Append('[');

            if (deque.Count > 0)
            {
                if (isRight)
                {
                    sb.Append(deque.First.Value);
                    deque.RemoveFirst();
                    while (deque.Count > 0)
                    {
                        sb.Append(',').Append(deque.First.Value);
                        deque.RemoveFirst();
                    }
                }
                else
                {
                    sb.Append(deque.Last.Value);
                    deque.RemoveLast();
                    while (deque.Count > 0)
                    {
                        sb.Append(',').Append(deque.Last.Value);
                        deque.RemoveLast();
                    }
                }
            }
            sb.Append(']').Append('\n');
        }
    }
}
