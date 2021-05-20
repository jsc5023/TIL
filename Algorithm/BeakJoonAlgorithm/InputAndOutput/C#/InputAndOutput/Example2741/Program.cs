using System;
using System.Text;

namespace Example2741
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            StringBuilder allnumbers = new StringBuilder();

            for (int i = 1; i <= n; i++)
            {
                allnumbers.Append(i + "\n"); // 하나씩 Console.WriteLine(i) 로 찍어버리면 속도 오류가 난다. 그래서 StringBuilder를 이용하는게 Best
            }
            Console.Write(allnumbers);
        }
    }
}
