using System;

namespace Example1259
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                string str = Console.ReadLine();

                if (str == "0")
                    return;
                string reverse = "";

                for (int i = str.Length - 1; i >= 0 ; i--)
                {
                    reverse += str[i];
                }

                if(str == reverse)
                    Console.WriteLine("yes");
                else
                    Console.WriteLine("no");
            }
        }
    }
}
