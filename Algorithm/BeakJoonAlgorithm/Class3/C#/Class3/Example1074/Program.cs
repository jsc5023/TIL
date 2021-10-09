using System;

namespace Example1074
{
    class Program
    {
        static int cnt = 0;
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int N = int.Parse(s[0]);
            int r = int.Parse(s[1]);
            int c = int.Parse(s[2]);

            int pow = (int)Math.Pow(2, N);

            find(pow, r, c);
            Console.Write(cnt);
        }

        private static void find(int pow, int r, int c)
        {
            if (pow == 1)
                return;

            if (r < pow / 2 && c < pow / 2)
            {
                find(pow / 2, r, c);
            }
            else if (r < pow / 2 && c >= pow / 2)
            {
                cnt += pow * pow / 4;
                find(pow / 2, r, c - pow / 2);
            }
            else if (r >= pow / 2 && c < pow / 2)
            {
                cnt += (pow * pow / 4) * 2;
                find(pow / 2, r - pow / 2, c);
            }
            else
            {
                cnt += (pow * pow / 4) * 3;
                find(pow / 2, r - pow / 2, c - pow / 2);
            }
        }
    }
}
