using System;

namespace Cryptography
{
    class Cryptography
    {
        /// <summary>
        /// 내가 직접 푼 풀이
        /// </summary>
        /// <param name="numbers"></param>
        /// <returns></returns>
        public static long encrypt(int[] numbers)
        {
            long ans = 0;
            long AddNumberMul = 1;
            for (int i = 0; i < numbers.Length; i++)
            {
                int[] AddListNumbers = new int[numbers.Length];
                Array.Copy(numbers, AddListNumbers, numbers.Length); // 얕은복사, 깊은복사 때문에
                // 깊은 복사를 해서, numbers의 값을 바뀌지 않게 하고싶었기 때문에 이렇게 사용했습니다.

                AddListNumbers[i] = AddListNumbers[i] + 1;
                for (int j = 0; j < AddListNumbers.Length; j++)
                {
                    AddNumberMul *= AddListNumbers[j];
                }
                ans = Math.Max(ans, AddNumberMul);
                AddNumberMul = 1;
            }
            return ans;
        }

        /// <summary>
        /// 일반적인 해답
        /// </summary>
        /// <param name="numbers"></param>
        /// <returns></returns>
        public static long encryptNormalSolution(int[] numbers)
        {
            long ans = 0;

            for (int i = 0; i < numbers.Length; i++)
            {
                long temp = 1;// 초기값
                for (int j = 0; j < numbers.Length; j++)
                {
                    if(i == j)
                    {
                        temp *= numbers[i] + 1; // 선택한 값의 개념, 만약 선택한(즉 i의값)에 +1을 해서 곱하고
                    }
                    else
                    {
                        temp *= numbers[j]; // 아니면 그냥 곱한다.
                    }
                    ans = Math.Max(ans, temp);
                }
            }
            return ans;
        }

        /// <summary>
        /// 응용 해답입니다.(가장 작은 숫자에 +1을 하면 된다는 특징으로)
        /// </summary>
        /// <param name="numbers"></param>
        /// <returns></returns>
        public static long encryptApplicatedSolution(int[] numbers)
        {
            long ret = 1;
            Array.Sort(numbers); // 정렬해서 가장작은값을 +1시킨후 전부 곱합니다. 이러면 반복문을 한번 덜돕니다.
            numbers[0]++;
            for (int i = 0; i < numbers.Length; i++)
            {
                ret *= numbers[i];
            }
            return ret;
        }


        static void Main(string[] args)
        {
            //Example 1
            // numbers = {1,2,3}
            // return 12

            //Example 2
            // numbers = {1,3,2,1,1,3};
            // return 36

            //Example 3
            // numbers = {1000, 999, 998, 997, 996, 995}
            // Return: 986074810223904000

            //Example 4
            // numbers = {1,1,1,1}
            // Returns : 2

            //int[] numbers = { 1, 2, 3 };
            //int[] numbers = { 1, 3, 2, 1, 1, 3 };
            int[] numbers = { 1000, 999, 998, 997, 996, 995 };
            //int[] numbers = { 1, 1, 1, 1 };
            Console.WriteLine(encryptNormalSolution(numbers));
        }
    }
}
