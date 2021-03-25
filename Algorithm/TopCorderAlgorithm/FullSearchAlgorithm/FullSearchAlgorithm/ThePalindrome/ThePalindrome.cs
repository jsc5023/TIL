using System;

namespace ThePalindrome
{
    // 앞에서 읽으나, 뒤에서 읽으나 같은 단어 회문 찾기

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
            for (int i = s.Length; i < 50; i++)
            {
                for (char j = 'a'; j <= 'z'; j++)
                {
                    TempString = s + j;
                    for (int k = TempString.Length - 1; k >= 0; k--)
                    {
                        TempReverseString = TempReverseString + TempString[k];
                    }

                    if (TempReverseString == TempString)
                    {
                        ans = TempString;
                        break;
                    }

                    TempReverseString = "";
                }
            }


            return ans.Length; 
        }

        static void Main(string[] args)
        {
            // Example 1 string s = "abab";
            // Returns : 5

            // Example 2 string s = "abacaba"
            // Returns : 7

            // Example 3 string s = "qwerty"
            // Returns : 11

            Console.WriteLine(find("qwerty")); // 아직 해답 안나옴
        }
    }
}
