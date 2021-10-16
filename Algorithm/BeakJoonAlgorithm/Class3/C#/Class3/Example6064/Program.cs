using System;

namespace Example6064
{
    class Program
    {
        public static void Main(String[] args)
        {
            int T = int.Parse(Console.ReadLine());

            for (int tc = 1; tc <= T; tc++)
            {
                string[] s = Console.ReadLine().Split(' ');
                int M = int.Parse(s[0]), N = int.Parse(s[1]), x = int.Parse(s[2]), y = int.Parse(s[3]);

                int lcm = M * N / gcd(M, N);
                int n = 0;
                int ans = -1;
                while (n * M < lcm)
                {
                    if ((n * M + x - y) % N == 0)
                    {
                        ans = n * M + x;
                        break;
                    }
                    n++;
                }

                Console.WriteLine(ans);
            }
        }

        static int gcd(int n1, int n2)
        {
            if (n2 == 0)
                return n1;
            return gcd(n2, n1 % n2);
        }
    }
}
