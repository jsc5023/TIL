using System;
using System.Text;

namespace Example2751
{
    class Program
    {
        static void Main(string[] args)
        {
            // 인터넷에서 찾아서함
            // 이유는 Console.WriteLine을 반복하다보니, 속도가 굉장히 느려짐
            int N = int.Parse(Console.ReadLine());

            int[] result = new int[N];

            for (int i = 0; i < N; i++)
            {
                result[i] = int.Parse(Console.ReadLine());
            }

            Array.Sort(result);

            StringBuilder sb = new StringBuilder(string.Join("\n", result));
            // Join은 특정 문자로 연결해주는것이다.
            // (1\n2\n3\n 이런식으로 만들어준다. 
            Console.WriteLine(sb);
        }
    }
}
