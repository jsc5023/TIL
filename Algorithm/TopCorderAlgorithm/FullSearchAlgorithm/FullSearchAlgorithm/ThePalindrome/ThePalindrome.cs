using System;

namespace ThePalindrome
{
    // 앞에서 읽으나, 뒤에서 읽으나 같은 단어 회문 찾기
    // 회문은 앞에서 읽으나, 뒤에서부터 읽으나 같은 단어를 말합니다.
    class ThePalindrome
    {
        public static int find(string s){
            string ans = "";
            string TempString = "";
            string TempReverseString = "";
            TempString = s;

            for (int j = TempString.Length - 1; j >= 0; j--)
            {
                TempReverseString = TempReverseString + TempString[j];
            }


            if (TempReverseString == TempString)
            {
                ans = TempString;
                return ans.Length;
            }
            TempReverseString = "";
            //for (int i = s.Length; i < 50; i++)
            //{
            //    for (char j = 'a'; j <= 'z'; j++)
            //    {
            //        TempString = s + j;
            //        for (int k = TempString.Length - 1; k >= 0; k--)
            //        {
            //            TempReverseString = TempReverseString + TempString[k];
            //        }

            //        if (TempReverseString == TempString)
            //        {
            //            ans = TempString;
            //            break;
            //        }

            //        TempReverseString = "";
            //    }
            //} 다시 생각해보기


            return ans.Length; 
        }

        public static int findBasicSolution(string s)
        {
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

            // Example 4 string s = "abdfhdyrbdbsdfghjkllkjhgfds"
            // Returns : 38

            Console.WriteLine(findBasicSolution("abab")); // 아직 해답 안나옴
        }
    }
}
