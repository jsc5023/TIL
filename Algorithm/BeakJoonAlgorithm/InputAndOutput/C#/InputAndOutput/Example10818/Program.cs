using System;

namespace Example10818
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int max = -1000001;
            int min = 1000001;

            string[] inputString = Console.ReadLine().Split(' '); // 공백
            int[] inputInt = new int[n];

            for (int i = 0; i < n; i++)
            {
                inputInt[i] = int.Parse(inputString[i]);

                if (inputInt[i] > max)
                    max = inputInt[i];

                if (inputInt[i] < min)
                    min = inputInt[i];
            }
            Console.WriteLine(min + " " + max);
        }
    }
}
