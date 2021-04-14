using System;

namespace ThePalindrome
{
    // 앞에서 읽으나, 뒤에서 읽으나 같은 단어 회문 찾기
    // 회문은 앞에서 읽으나, 뒤에서부터 읽으나 같은 단어를 말합니다.
    class ThePalindrome
    {
        public static int find(string s){
            string ans = "";
            string ReverseString = "";
            string SumString = "";
            string RightJudgeString = "";
            string LeftJudgeString = "";
            int n = 0;
            for (int i = s.Length - 1; i >= 0; i--)
            {
                ReverseString = ReverseString + s[i];
            }

            if (s == ReverseString)
            {
                ans = ReverseString;
                return ans.Length;
            }

            ReverseString = "";

            for (int i = s.Length - 2; i >= 0; i--)
            {
                ReverseString = ReverseString + s[i];
            }

            for (int i = 0; i < s.Length; i++)
            {
                SumString = s + ReverseString;
            }




            for (int i = decimal.ToInt32(Math.Round((decimal)s.Length / 2)); i < SumString.Length; i++)
            {
                RightJudgeString = "";
                LeftJudgeString = "";
                for (int j = 1; j <=i; j++)
                {
                    RightJudgeString = RightJudgeString + SumString[i - j];
                    LeftJudgeString = LeftJudgeString + SumString[i + j];
                }
                if(RightJudgeString == LeftJudgeString)
                {
                    ans = RightJudgeString + LeftJudgeString + "c"; // c는 그냥 임의의 값입니다.
                    return ans.Length;
                }
            }

            return ans.Length; 
        }

        public static int findBasicSolution(string s)
        {
            // 가장 오른쪽 문자는 가장 왼쪽의 문자로 자동결정이 된다.
            // 조건이 아무것도 없을때 계속 증가함 어짜피 회문은 반드시 나오기 떄문에 
            for (int i = s.Length; ; i++)
            {
                bool flag = true;
                for (int j = 0; j < s.Length; j++)
                {
                    if((i - j - 1) < s.Length && s[j] != s[i - j - 1])
                    {
                        flag = false;
                        break;
                    }

                    if (flag) return i;
                }
            }
        }

        static void Main(string[] args)
        {
            // Example 1 string s = "abab";
            // Returns : 5

            // Example 2 string s = "abacaba"
            // Returns : 7

            // Example 3 string s = "qwerty"
            // Returns : 11

            Console.WriteLine(findBasicSolution("qwerty")); // 자체 풀이보다 더 좋은 풀이 찾기
        }
    }
}
