using System;
using System.Collections;

namespace Graph
{
    class Program
    {
        // 재귀함수 예시
        static int fib(int a)
        {
            if (a <= 1) return 1;
            return fib(a - 1) + fib(a - 2); // 피보나치 수열
        }

        // 깊이 우선 탐색(재귀함수의 예시)
        //static int dfs(int now)
        //{
        //    if(현재 상태 now가 끝나는 조건) return 현재 상태 now의 값;
        //    int ret = -1;
        //    for (int i = 0; i < 다음 상태 개수; i++)
        //    {
        //        int pnext = i번째 다음 상태;
        //        if(next가 조건을 만족하는 경우) ret = Math.Max(dfx(next), ret);

        //    }
        //    return ret;
        //}

        // 너비 우선 탐색 구현
        //static void bfs()
        //{
        //    Queue<T> q = new Queue<T>();
        //    q.Enqueue(초기 상태);
        //    while (q.Count != 0)
        //    {
        //        T now = q.Dequeue();
        //        for (int i = 0; i < 다음 상태 개수; i++)
        //        {
        //            T next = i번째 다음 상태;
        //            if (next를 방문했었는지 판정)
        //            {
        //                q.Dequeue(next);
        //            }
                       
        //        }
        //    }
        //}
       

        static void Main(string[] args)
        {

            Console.WriteLine(fib(3));
        }
    }
}
