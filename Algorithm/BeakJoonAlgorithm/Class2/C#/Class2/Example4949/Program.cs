using System;
using System.Collections.Generic;
using System.Text;

namespace Example4949
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();
            while (true)
            {
                string str = Console.ReadLine();
                if (str == ".")
                    break;
                sb.Append(solve(str)).Append("\n");
            }

            Console.Write(sb);
        }

        private static string solve(string str)
        {
            Stack<char> stack = new Stack<char>();
            for (int i = 0; i < str.Length; i++)
            {
                char c = str[i];
                if (c == '(')
                    stack.Push(c);
                else if (c == '[')
                    stack.Push(c);
                else if(c == ')')
                {
                    if (stack.Count == 0 || stack.Peek() != '(')
                        return "no";
                    else
                        stack.Pop();
                }
                else if (c == ']')
                {
                    if (stack.Count == 0 || stack.Peek() != '[')
                        return "no";
                    else
                        stack.Pop();
                }   
            }

            if (stack.Count == 0)
                return "yes";
            else
                return "no";
        }
    }
}
