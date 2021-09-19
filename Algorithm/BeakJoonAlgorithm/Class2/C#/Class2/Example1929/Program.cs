using System;
using System.Collections;
using System.Text;

namespace Example1929
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');
            int M = int.Parse(s[0]);

            int N = int.Parse(s[1]);

            ArrayList resultList = eratos();

            int i = 0;
            StringBuilder sb = new StringBuilder();
            while (true)
            {
                int indexPrime = (int)resultList[i];

                if (N < indexPrime)
                {
                    break;
                }

                if (M <= indexPrime)
                {
                    sb.Append(indexPrime).Append("\n");
                }
                i++;
            }

            Console.Write(sb);
        }

        private static ArrayList eratos()
        {
            int N = 1000000;
            ArrayList primeList = new ArrayList();
            ArrayList primeNumberList = new ArrayList();

            // 0번째와 1번째를 소수 아님으로 처리
            primeList.Add(false);
            primeList.Add(false);
            // 2~ n 까지 소수로 설정
            for (int i = 2; i <= N; i++)
                primeList.Add(true);

            // 2 부터  ~ i*i <= n
            // 각각의 배수들을 지워간다.
            for (int i = 2; (i * i) <= N; i++)
            {
                if ((bool)primeList[i] == true)
                {
                    for (int j = i * i; j <= N; j += i) primeList[j] = false;
                    //i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
                }
            }

            for (int i = 0; i <= N; i++)
            {
                if ((bool)primeList[i] == true)
                {
                    primeNumberList.Add(i);
                }
            }

            return primeNumberList;
        }
    }
}
