using System;

namespace Example5525
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            int M = int.Parse(Console.ReadLine());
            char[] s = Console.ReadLine().ToCharArray();

            int cnt = 0;
            int patternCnt = 0;
            for (int i = 1; i < M - 1; i++)
            {
                if (s[i - 1] == 'I' && s[i] == 'O' && s[i + 1] == 'I')
                {
                    patternCnt++;
                    if (patternCnt == N)
                    {
                        patternCnt--;
                        cnt++;
                    }
                    i++;
                }
                else
                    patternCnt = 0;                    
            }

            Console.Write(cnt);
        }
    }
}
