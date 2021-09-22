using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Example1966
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            StringBuilder sb = new StringBuilder();
            while (T-- > 0)
            {
                string[] s = Console.ReadLine().Split(' ');

                int N = int.Parse(s[0]);
                int M = int.Parse(s[1]);

                LinkedList<int[]> queue = new LinkedList<int[]>();

                string[] queueIn = Console.ReadLine().Split(' ');
                for (int i = 0; i < N; i++)
                {
                    queue.AddLast(new int[] { i, int.Parse(queueIn[i]) });
                }

                int cnt = 0;

                while (queue.Count > 0)
                {
                    int[] front = queue.First.Value; // 가장 첫 원소
                    queue.RemoveFirst();
                    bool isMax = true;   // front 원소가 가장 큰 원소인지를 판단하는 변수

                    // 큐에 남아있는 원소들과 중요도를 비교 
                    for (int i = 0; i < queue.Count; i++)
                    {

                        // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우 
                        if (front[1] < queue.ElementAt(i)[1])
                        {
                            // 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
                            queue.AddLast(front);
                            for (int j = 0; j < i; j++)
                            {
                                int[] last = queue.First.Value;
                                queue.RemoveFirst();
                                queue.AddLast(last);
                            }

                            // front원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
                            isMax = false;
                            break;
                        }
                    }

                    // front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
                    if (isMax == false)
                    {
                        continue;
                    }

                    // front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서다.
                    cnt++;
                    if (front[0] == M)
                    {   // 찾고자 하는 문서라면 해당 테스트케이스 종료
                        break;
                    }

                }

                sb.Append(cnt).Append('\n');
            }

            Console.Write(sb);
        }
    }
}
