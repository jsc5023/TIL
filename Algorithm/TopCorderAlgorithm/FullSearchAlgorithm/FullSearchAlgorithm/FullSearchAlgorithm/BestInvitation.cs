using System;
using System.Collections.Generic;

namespace FullSearchAlgorithm
{
    class BestInvitation
    {
        /// <summary>
        /// 내가 한 풀이
        /// </summary>
        /// <param name="first"></param>
        /// <param name="second"></param>
        /// <returns></returns>
        public static int bestInvitationMySolution(string[] first, string[] second)
        {
            int result = 0;
            int sum = 0;
            string SelectString;
            for (int i = 0; i < first.Length; i++)
            {
                SelectString = first[i];
                for (int j = 0; j < first.Length; j++)
                {
                    if (SelectString == first[j])
                        sum += 1;
                    else if (SelectString == second[j])
                        sum += 1;
                }
                if (sum >= result)
                    result = sum;
                sum = 0;

                SelectString = second[i];
                for (int j = 0; j < second.Length; j++)
                {
                    if (SelectString == first[j])
                        sum += 1;
                    else if (SelectString == second[j])
                        sum += 1;
                }
                if (sum >= result)
                    result = sum;
                sum = 0;
            }

            return result;
        }

        /// <summary>
        /// 일반적인 해답입니다.
        /// </summary>
        /// <param name="first"></param>
        /// <param name="second"></param>
        /// <returns></returns>
        public static int bestInvitationNormalSolution(string[] first, string[] second)
        {
            int ans = 0;
            for (int i = 0; i < first.Length; i++)
            {
                int f = 0;
                int s = 0;

                for (int j = 0; j < first.Length; j++)
                {
                    if(first[i] == first[j]) f++;
                    if (first[i] == second[j]) f++;
                    if (second[i] == first[j]) s++;
                    if (second[i] == second[j]) s++;
                }

                ans = Math.Max(f, ans);
                ans = Math.Max(s, ans);
            }
            // 위의 식과의 차이점은 우선 for문 first Length의 값을 하나만 사용해서 반복하고, 그것을 if문을 2번 더써서 나타낸것
            // ans의 if(sum)을 쓰지 않고 Math.Max를 이용하여 좀더 간편하게 나타낸 차이가 있습니다.
            return ans;
        }

        /// <summary>
        /// 좀더 응용해서 딕셔너리를 사용하여, for 반복문 중첩을 제거하는 방법입니다.
        /// </summary>
        /// <param name="first"></param>
        /// <param name="second"></param>
        /// <returns></returns>
        public static int bestInvitationApplicationSolution(string[] first, string[] second)
        {
            Dictionary<string, int> dic = new Dictionary<string, int>();

            for (int i = 0; i < first.Length; i++)
            {
                dic[first[i]] = 0; // 딕셔너리는 키와 값을 가지는데, 키값은 중복될수 없다. 따라서 중복된 값을 가지지는 않습니다.
                dic[second[i]] = 0;
            }

            for (int i = 0; i < first.Length; i++)
            {
                dic[first[i]]++; // 키값이 같은거면 +1씩 증가시킵니다.
                dic[second[i]]++;
            }

            int ans = 0;
            foreach (string key in dic.Keys)
            {
                ans = Math.Max(ans, dic[key]); // 키만큼 반복해서 키의 값의 최대값을 가져옵니다.
            }

            return ans;
        }

        static void Main(string[] args)
        {
            //Example 1
            // first = {"fishing", "gardening", "swimming", "fishing"}
            // second = {"hunting", "fishing", "fishing", "biting"}
            // return 4;

            //Example 2
            // first = {"variety", "diversity", "loquacity", "courtesy"}
            // second = {"talking", "speaking", "discussion", "meeting"}
            // return 1;

            //Example 3
            // first = {"snakes", "programming", "cobra", "monty"}
            // second = {"python", "python", "anaconda", "python"}
            // return 3;

            //Example 4
            // first = {"t"

            //string[] first = { "fishing", "gardening", "swimming", "fishing" };
            //string[] second = { "hunting", "fishing", "fishing", "biting" };

            //string[] first = { "variety", "diversity", "loquacity", "courtesy" };
            //string[] second = { "talking", "speaking", "discussion", "meeting" };

            string[] first = { "snakes", "programming", "cobra", "monty" };
            string[] second = { "python", "python", "anaconda", "python" };

            Console.WriteLine(bestInvitationApplicationSolution(first, second));
        }
    }
}
