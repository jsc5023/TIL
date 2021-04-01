using System;

namespace FriendScore
{
    class FriendScore
    {
        // TODO
        public static int highestScore(string[] friends)
        {
            //일단 직접 친구만 구하는 수식을 구했음
            int ans = 0;
            int n = friends[0].Length; // 처음사람의 사람과의 관계를 잡는다.(직접 친구 찾기)
            int cnt = 0;// 친구수
            for (int i = 0; i < n; i++)
            {
                cnt = 0;
                for (int j = 0; j < n; j++)
                {
                    if (friends[i][j] == 'Y')
                        cnt++;
                }
            }
            ans = cnt;
            return ans;
        }

        static void Main(string[] args)
        {
            // Example 1
            //string[] friends = { "NNN", "NNN", "NNN" };
            //Returns: 0

            // Example 2
            string[] friends = { "NYY", "YNY", "YYN" };
            // Returns : 2

            // Example 3
            // string[] friends = {"NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN"}
            // Returns : 4
            Console.WriteLine(highestScore(friends));
        }
    }
}
