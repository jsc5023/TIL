using System;

namespace Example1629
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] s = Console.ReadLine().Split(' ');

            ulong A = ulong.Parse(s[0]);
            ulong B = ulong.Parse(s[1]);
            ulong C = ulong.Parse(s[2]);

            Console.Write(pow(A, B, C));
        }

        public static ulong pow(ulong A, ulong B, ulong C)
        {
            // 모듈러 연산에 따라 (A * B) % C = (A % C * B % C) % C
            if (B == 1) // 1일경우
            {
                return A % C;
            }

            // A^4 * A^4 -> 반복해서 나눈다.
            ulong temp = pow(A, B / 2, C);

            // 홀수의 경우
            if (B % 2 == 1)
            {
                return (temp * temp % C) * A % C;
            }
            // 짝수의 경우
            return temp * temp % C;

        }
    }
}
