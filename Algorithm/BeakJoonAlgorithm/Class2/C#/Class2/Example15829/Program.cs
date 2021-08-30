using System;

namespace Example15829
{
    class Program
    {
        static void Main(string[] args)
        {
            int L = int.Parse(Console.ReadLine());

            string str = Console.ReadLine();

            ulong[] hashNumber = new ulong[str.Length];
            for (int i = 0; i < str.Length; i++)
            {
                hashNumber[i] = (ulong)(str[i] - 'a' + 1);
            }

            ulong result = 0;
            ulong pow = 1;
            for (int i = 0; i < L; i++)
            {
                result += (hashNumber[i] * pow) % 1234567891;
                pow *= 31;
                pow %= 1234567891;
            }
            
            Console.Write(result %= 1234567891);
        }
    }
}
