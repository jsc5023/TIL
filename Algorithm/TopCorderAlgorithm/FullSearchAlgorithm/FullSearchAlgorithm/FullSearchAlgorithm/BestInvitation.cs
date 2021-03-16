using System;

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
        public static int bestInvitation(string[] first, string[] second)
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
        public static int bestInvitationTwo(string[] first, string[] second)
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

            Console.WriteLine(bestInvitationTwo(first, second));
        }
    }
}
