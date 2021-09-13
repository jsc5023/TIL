using System;
using System.Collections.Generic;

namespace Example10773
{
    class Program
    {
        static void Main(string[] args)
        {
            int K = int.Parse(Console.ReadLine());

            Stack<int> stack = new Stack<int>();

            for (int i = 0; i < K; i++)
            {
                int n = int.Parse(Console.ReadLine());

                if (n != 0)
                    stack.Push(n);
                else
                    stack.Pop();
            }

            int sum = 0;
            foreach (int item in stack)
            {
                sum += item;
            }

            Console.Write(sum);
        }
    }
}
