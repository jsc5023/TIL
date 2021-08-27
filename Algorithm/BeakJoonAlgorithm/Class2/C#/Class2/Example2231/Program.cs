using System;

namespace Example2231
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int result = 0;
            string digit = "";
            int[] digitNum = new int[8];
            for (int i = 0; i < n; i++)
            {
                digit = i.ToString();
                for (int j = 0; j < digit.Length; j++)
                {
                    digitNum[j] = int.Parse(digit[j].ToString());
                    result += digitNum[j];

                    if(j == digit.Length - 1)
                    {
                        result += i;
                        if(result == n)
                        {
                            Console.Write(i);
                            return;
                        }
                    }
                }
                result = 0;
            }

            Console.Write(0);
        }
    }
}
