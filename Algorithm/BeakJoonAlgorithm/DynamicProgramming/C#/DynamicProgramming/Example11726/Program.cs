using System;

namespace Example11726
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] dp = new int[n + 2]; // 

            dp[1] = 1; dp[2] = 2;

            for (int i = 3; i <= n; i++)
            {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 10007; // dp[n]에 사용하지 않고, 여기에 붙인이유 -> Write(dp[n])은 int의 범위를 넘어서기 때문에, 이렇게 적어야됩니다.
            }

            Console.Write(dp[n]);
        }
    }
}
