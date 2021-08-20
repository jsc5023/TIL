using System;

namespace Example11054
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string[] inputNum = Console.ReadLine().Split(' ');

            int[] dt = new int[n + 1];
            for (int i = 0; i < inputNum.Length; i++)
                dt[i] = int.Parse(inputNum[i]);

            int[] dpIncrease = new int[n + 1]; // 왼쪽에서 시작, 점점 증가하는 dp

            dpIncrease[0] = 1;

            for (int i = 1; i < n; i++){
                dpIncrease[i] = 1;
                for (int j = 0; j < i; j++)
                {
                    if (dt[j] < dt[i] && dpIncrease[j] + 1 > dpIncrease[i])
                        dpIncrease[i] = dpIncrease[j] + 1;
                }
            }

            int[] dpDecrease = new int[n + 1];
            dpIncrease[n - 1] = 1;
            for (int i = n - 2; i >= 0; i--)
            {
                dpDecrease[i] = 1;
                for (int j = n-1; j > i; j--)
                {
                    if (dt[j] < dt[i] && dpDecrease[j] + 1 > dpDecrease[i])
                        dpDecrease[i] = dpDecrease[j] + 1;
                }
            }

            int maxLength = 0;
            for (int i = 0; i < n; i++)
            {
                maxLength = Math.Max(dpIncrease[i] + dpDecrease[i], maxLength);
            }

            Console.Write(maxLength);
        }
    }
}
