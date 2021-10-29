using System;
using System.Numerics;

namespace Example2407
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            int n = int.Parse(s[0]);
            int m = int.Parse(s[1]);

            BigInteger cnt = 1;

            BigInteger[] dp_n = new BigInteger[m + 1];
            BigInteger[] dp_m = new BigInteger[m + 1];
            //ulong[
            dp_n[0] = (BigInteger)n;
            dp_m[0] = (BigInteger)m;
            for (int i = 0; i < m; i++)
            {
                dp_n[i + 1] = dp_n[i] - 1;
                dp_m[i + 1] = dp_m[i] - 1;
            }

            for (int i = 0; i < m; i++)
            {
                cnt *= dp_n[i];
                for (int j = 0; j < m; j++)
                {
                    if(cnt > 50 && dp_m[j] != 0 && cnt % dp_m[j] == 0)
                    {
                        cnt /= dp_m[j];
                        dp_m[j] = 0;
                    }
                }
            }

            for (int i = 0; i < m; i++)
            {
                if (dp_m[i] != 0)
                    cnt /= dp_m[i];
            }

            Console.Write(cnt);
        }
    }
}
