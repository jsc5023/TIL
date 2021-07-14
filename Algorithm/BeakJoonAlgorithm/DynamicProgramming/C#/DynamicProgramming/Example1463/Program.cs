using System;

namespace Example1463
{
    class Program
    {
        static void Main(string[] args)
        {
            // 문제 풀이 방법 - 작은문제를 먼저 풀고, 그후 순차적으로 수행해 나간다.
            // 이문제의 가장 핵심은, Dynamic Programing 으로서 dp[1~ 1000000]까지의 배열에 저장한다는 것입니다.(값을 저장하기 위해서)
            
            // (풀이방법 - dp배열 선언, 그리고 기본값 선언 dp[0], dp[1] 그후 dp[i]의 값의 최소값을 구해야하며
            // 3, 2로 나누어떨어지거나 -1을 했을때 저장한 값이 있다면, 그 값에 + 1을 하면 그때의 최소 연산이 구해진다는 점에 있습니다.

            int X = int.Parse(Console.ReadLine());
            int[] dp = new int[X + 1];

            dp[0] = dp[1] = 0;
            for (int i = 2; i <= X; i++)
            {
                dp[i] = dp[i - 1] + 1;
                if (i % 2 == 0)
                    dp[i] = Math.Min(dp[i], dp[i / 2] + 1);
                if (i % 3 == 0)
                    dp[i] = Math.Min(dp[i], dp[i / 3] + 1);
            }
            Console.Write(dp[X]);
        }
    }
}
