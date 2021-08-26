using System;

namespace Example4153
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                string[] str = Console.ReadLine().Split(' ');

                int[] n = new int[str.Length];

                n[0] = int.Parse(str[0]);
                n[1] = int.Parse(str[1]);
                n[2] = int.Parse(str[2]);

                if ((n[0] == 0) && (n[1] == 0) && (n[2] == 0))
                    break;

                int temp = 0;
                if(n[0] > n[1])
                {
                    temp = n[0];
                    n[0] = n[1];
                    n[1] = temp;
                }

                if(n[1] > n[2])
                {
                    temp = n[1];
                    n[1] = n[2];
                    n[2] = temp;
                }

                if ((n[0] * n[0]) + (n[1] * n[1]) == (n[2] * n[2]))
                    Console.WriteLine("right");
                else
                    Console.WriteLine("wrong");
            }
        }
    }
}
