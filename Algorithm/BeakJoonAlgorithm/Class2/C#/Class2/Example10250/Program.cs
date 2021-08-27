using System;

namespace Example10250
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            int result = 0;
            for (int i = 0; i < T; i++)
            {
                string[] str = Console.ReadLine().Split(' ');

                int H = int.Parse(str[0]);
                int W = int.Parse(str[1]);
                int N = int.Parse(str[2]);

                if (N % H == 0)
                {
                    result = H * 100 + (N / H);
                }
                else
                {
                    result = (N % H) * 100 + (N / H) + 1;
                }

                Console.WriteLine(result);
            }
        }
    }
}
