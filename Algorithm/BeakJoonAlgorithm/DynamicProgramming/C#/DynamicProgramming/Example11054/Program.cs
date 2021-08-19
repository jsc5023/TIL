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

            for (int i = 0; i < n; i++){
                dpIncrease[0] = 1;
                for (int j = 0; j < i; j++)
                {
                    if (dt[j] < dt[i])
                        dpIncrease[i] = dpIncrease[j] + 1;
                }
            }
        }
    }
}
