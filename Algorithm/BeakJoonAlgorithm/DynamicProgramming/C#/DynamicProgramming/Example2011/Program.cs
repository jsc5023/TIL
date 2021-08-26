using System;

namespace Example2011
{
    class Program
    {
        static void Main(string[] args)
        {
            // 틀리는 이유를 찾지못해서 인터넷참조, 0때문임.(주의)
            string str = Console.ReadLine();

            long[] dp = new long[str.Length + 2];

            dp[0] = dp[1] = 1;

            if(str[0] == '0') // 처음에 0일경우 -> 어떤암호도 가능하지 않음, 반드시 0
            {
                Console.WriteLine(0);
                return;
            }

            for (int i = 1; i < str.Length; i++)
            {
                char pri = str[i - 1]; // 0부터 계속증가,

                if (str[i] >= '1' && str[i] <= '9')
                {
                    dp[i + 1] += dp[i];
                    dp[i + 1] %= 1000000;
                }

                if (!(pri == '0' || pri > '2' || (pri == '2' && str[i] > '6')))
                {
                    dp[i + 1] += dp[i - 1];
                    dp[i + 1] %= 1000000;
                }

                dp[i + 1] %= 1000000000;
            }
            Console.WriteLine(dp[str.Length] % 1000000000);
            // 이해하기 난해했다.
            // 일단 풀이방식은 간단하게 생각해보면 들어오는 첫글자가 0이면 값이없으므로 0을리턴
            // 나머지 자연수값은 반드시 1이상의 값을 가질 수 있다.
            // 그런데, 10~26사이의 수는 다른 방법이 존재한다. 이점을 가지고 문제를 풀면 해결가능하다.

        }
    }
}
