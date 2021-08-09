using System;

namespace Example10844
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] dp = new int[101,10]; // [자리수, 10진수 수]
            int sum = 0;

            int N = int.Parse(Console.ReadLine()); // 자리수
            for (int i = 0; i< 10; i++)
	            dp[1,i] = 1;

            for (int i = 2; i <= N; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    if (j == 0)
                        dp[i,0] = dp[i - 1,1];
                    else if (j == 9)
                        dp[i,9] = dp[i - 1,8];
                    else
                        dp[i,j] = (dp[i - 1, j - 1] + dp[i - 1,j + 1]) % 1000000000;
                }
            }

            for (int i = 1; i < 10; i++)
            {
                sum = (sum + dp[N,i]) % 1000000000;
            }

            Console.Write(sum % 1000000000);
        }
    }
}
