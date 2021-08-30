    using System;

    namespace Example11050
    {
        class Program
        {
            static void Main(string[] args)
            {
                string[] str = Console.ReadLine().Split(' ');

                int N = int.Parse(str[0]);
                int K = int.Parse(str[1]); // N컴비네이션 K

                int top = 1;
                int result = 0;
                for (int i = N; i > N-K; i--)
                {
                    top *= i;
                }

                int bottom = 1;
                for (int i = 1; i <= K; i++)
                {
                    bottom *= i;
                }

                result = top / bottom;

                Console.Write(result);
            }
        }
    }
