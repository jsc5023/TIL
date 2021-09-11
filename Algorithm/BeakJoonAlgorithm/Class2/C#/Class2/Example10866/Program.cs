using System;
using System.Collections.Generic;
using System.Text;

namespace Example10866
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            LinkedList<int> deque = new LinkedList<int>();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++)
            {
                string[] str = Console.ReadLine().Split(' ');

                switch (str[0])
                {
                    case "push_front":
                        deque.AddFirst(int.Parse(str[1]));
                        break;

                    case "push_back":
                        deque.AddLast(int.Parse(str[1]));
                        break;

                    case "pop_front":
                        if (deque.Count == 0)
                            sb.Append(-1).Append("\n");
                        else
                        {
                            sb.Append(deque.First.Value).Append("\n");
                            deque.RemoveFirst();
                        }
                        break;

                    case "pop_back":
                        if (deque.Count == 0)
                            sb.Append(-1).Append("\n");
                        else
                        {
                            sb.Append(deque.Last.Value).Append("\n");
                            deque.RemoveLast();
                        }
                        break;

                    case "size":
                        sb.Append(deque.Count).Append("\n");
                        break;

                    case "empty":
                        if (deque.Count == 0)
                            sb.Append(1).Append("\n");
                        else
                        {
                            sb.Append(0).Append("\n");
                        }
                        break;

                    case "front":
                        if (deque.Count == 0)
                            sb.Append(-1).Append("\n");
                        else
                        {
                            sb.Append(deque.First.Value).Append("\n");
                        }
                        break;

                    case "back":
                        if (deque.Count == 0)
                            sb.Append(-1).Append("\n");
                        else
                        {
                            sb.Append(deque.Last.Value).Append("\n");
                        }
                        break;
                } 
            }
            Console.Write(sb);
        }
    }
}
