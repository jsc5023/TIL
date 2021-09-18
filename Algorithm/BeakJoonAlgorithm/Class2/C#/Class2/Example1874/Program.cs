using System;
using System.Collections.Generic;
using System.Text;

namespace Example1874
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            Stack<int> stack = new Stack<int>();

            StringBuilder sb = new StringBuilder();

            int start = 0;
            for (int i = 0; i < n; i++)
            {
                int inputStack = int.Parse(Console.ReadLine());

                if (inputStack > start)
                {
                    for (int j = start + 1; j <= inputStack; j++)
                    {
                        stack.Push(j);
                        sb.Append("+").Append("\n");
                    }
                    start = inputStack;
                }

                else if (stack.Peek() != inputStack)
                {
                    Console.Write("NO");
                    return;
                }

                stack.Pop();
                sb.Append("-").Append("\n");

            }

            Console.Write(sb);
        }
    }
}
