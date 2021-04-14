using System;

namespace FriendScore
{
    class FriendScore
    {
        // TODO
        public static int highestScore(string[] friends)
        {
            // else 부분은 해설을 참조하며 사용했습니다.
            //일단 직접 친구만 구하는 수식을 구했음
            int ans = 0;
            int n = friends[0].Length; // 처음사람의 사람과의 관계를 잡는다.(직접 친구 찾기)
            int cnt = 0;// 친구수
            for (int i = 0; i < n; i++)
            {
                cnt = 0;
                for (int j = 0; j < n; j++)
                {
                    if (i == j) continue; // 자기자신일때는 continue로 뛰어넘는다.

                    if (friends[i][j] == 'Y')
                        cnt++;

                    else
                    {
                        for (int k = 0; k < n; k++)
                        {
                            if(friends[j][k] == 'Y' && friends[k][i] == 'Y')
                            {
                                // friends[0]
                                cnt++;
                                break;
                            }
                        }
                    }
                }
                ans = Math.Max(ans, cnt);
            }
           
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
            //string[] friends = { "NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN" };
            // Returns : 4
            Console.WriteLine(highestScore(friends));
        }
    }
}
