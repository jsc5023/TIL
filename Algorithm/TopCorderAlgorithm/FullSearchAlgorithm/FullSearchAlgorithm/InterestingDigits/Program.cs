using System;
using System.Collections.Generic;

namespace InterestingDigits
{
    class InterestingDigits
    {
        public static int[] digits(int bas)
        {
            // 잘 감이 안잡혀서 문제 해설을 참고하여 푼 문제이다.
            // 핵심은 4자리 미만이라는 조건이다.
            // 3자리 까지만 고려하면 되므로, 1의 자리, 2의자리, 3의 자리 모두 확인해 보면된다.
            int[] ans = new int[bas - 2]; 
            for (int i = 2  ; i < bas; i++)
            {
               
            }
            return ans;
        }

        public static int[] digitsBasicSolution(int bas)
        {
            List<int> ans = new List<int>();

            for (int i = 2; i < bas; i++)
            {
                bool ok = true;
                for (int k1 = 0; k1 < bas; k1++)
                {
                    for (int k2 = 0; k2 < bas; k2++)
                    {
                        for (int k3 = 0; k3 < bas; k3++)
                        {
                            if((k1 + k2 * bas + k3 * bas * bas) % i == 0 && (k1+k2+k3) % i != 0)
                            {
                                // n의 배수 숫자로 각 숫자의 합이 n의 배수가 아니면 n을 제외합니다.
                                ok = false;
                                break;
                            }
                            if (!ok) break;
                        }
                        if (ok) break;
                    }
                    if (ok) break;
                }
            }
            return ans.ToArray();
        }

        static void Main(string[] args)
        {
            // Example 1
            // base = 10;
            // Return : {3, 9}

            // Example 2
            // base = 3;
            // Return : {2}

            // Example
            // base = 9;
            // Return : {5, 25}

            Console.WriteLine("Hello World!");
        }
    }
}
