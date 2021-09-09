using System;
using System.Text;

namespace Example10828
{
    class Program
    {
        static int[] stack;
        static int nowIndex = 0;

        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            stack = new int[N];

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++)
            {
                string[] str = Console.ReadLine().Split(' ');

                if (str[0] == "push")
                {
                    int inputNum = int.Parse(str[1]);
                    push(inputNum);
                }
                else if (str[0] == "pop")
                    sb.Append(pop()).Append("\n");
                else if (str[0] == "size")
                    sb.Append(size()).Append("\n");
                else if (str[0] == "empty")
                    sb.Append(empty()).Append("\n");
                else if (str[0] == "top")
                    sb.Append(top()).Append("\n");
            }

            Console.Write(sb);
        }

        private static void push(int inputNum)
        {
            stack[nowIndex] = inputNum;
            nowIndex++;
        }

        private static int pop()
        {
            if (nowIndex == 0)
                return -1;
            else
            {
                int result = stack[nowIndex - 1];
                stack[nowIndex - 1] = 0;
                nowIndex--;
                return result;
            }
        }


        private static int size()
        {
            return nowIndex;
        }

        private static int empty()
        {
            if (nowIndex == 0)
                return 1;
            else
                return 0;
        }

        private static int top()
        {
            if (nowIndex == 0)
                return -1;
            else
            {
                return stack[nowIndex - 1];
            } 
        }
    }
}
