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

            // 수정필요
            List<int> ans = new List<int>();
            for (int i = 2  ; i < bas; i++) // 현재 숫자( bas진수에서의 선택한 숫자 입니다.)
            {
                bool nowBreak = true;
                // 현재 
                for (int j = 0; j < bas; j++) // 첫번째 자리
                {
                    for (int k = 0; k < bas; k++) // 두번째 자리
                    {
                        for (int m = 0; m < bas; m++) // 세번째 자리
                        {
                            //if(((j + k + m) % i == 0 )&& ((j * k * m) % i == 0))
                            //{
                            //    ans.Add(j);
                            //    ans.Add(k);
                            //    ans.Add(m);
                            //    nowBreak = true;
                            //    break;
                            //}

                            if (((j + k + m) % i != 0) && ((j + k * bas + m * bas * bas) % i == 0)) // 진수의 자리수 표현(j + k * bas + m * bas * bas)
                            {
                                nowBreak = false;
                                break;
                            }
                        }
                        if (!nowBreak) break;
                    }
                    if (!nowBreak) break;
                }
                if (nowBreak == true) ans.Add(i);
            }
            return ans.ToArray();
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

            int bas = 10;

            for (int i = 0; i < digits(bas).Length; i++)
            {
                Console.WriteLine(digits(bas)[i]);
        }
            
        }
    }
}
