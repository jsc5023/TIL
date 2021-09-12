using System;
using System.Collections.Generic;
using System.Text;

namespace Example9012
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++)
            {
                sb.Append(solve(Console.ReadLine())).Append("\n");
            }

            Console.Write(sb);
        }

        public static string solve(string str)
        {
            Stack<char> stack = new Stack<char>();

            for (int i = 0; i < str.Length; i++)
            {
                char c = str[i];

                if (c == '(')
                {
                    stack.Push(c);
                }

                // == '('가 아닌경우이며(따라서 ')'), 'C'가 존재하지 않을 경우입니다.
                else if (stack.Count == 0)
                {
                    return "NO";
                }
                // 그 외의 경우 stack 원소를 pop 한다.
                else
                {
                    stack.Pop();
                }
            }

            // 최종 (의 갯수가 )와 같으면 스택이 0이된다. 아니면 (의 갯수와 )의 갯수가 다르다.
            if (stack.Count == 0)
            {
                return "YES";
            }
            else
            {
                return "NO";
            }
        }
    }


}
