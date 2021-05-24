using System;
using System.Text;
namespace Example2742
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            StringBuilder sb = new StringBuilder();
            for (int i = n; i > 0; i--)
            {
                sb.Append(i + "\n");
            }
            Console.Write(sb);
        }
    }
}
