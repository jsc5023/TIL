using System;

namespace Example1541
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();

            string[] minusSplit = s.Split('-');

            int[] plusResult = new int[minusSplit.Length];
            for (int i = 0; i < minusSplit.Length; i++)
            {
                string[] plusNum = minusSplit[i].Split('+');

                for (int j = 0; j < plusNum.Length; j++)
                {
                    plusResult[i] += int.Parse(plusNum[j]);
                }
            }

            int sum = plusResult[0];

            for (int i = 1; i < plusResult.Length; i++)
            {
                sum -= plusResult[i];
            }

            Console.Write(sum);
        }
    }
}
