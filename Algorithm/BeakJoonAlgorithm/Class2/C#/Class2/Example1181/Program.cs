using System;

namespace Example1181
{
    class Program
    {
        static string[] str = new string[20001];
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                str[i] = Console.ReadLine();
            }

            int smallIndex;
            for (int i = 0; i < n - 1; i++)
            {
                smallIndex = i;
                for (int j = i+1; j < n; j++)
                {
                    if(str[j].Length < str[smallIndex].Length)
                    {
                        smallIndex = j;
                    }
                    else if(str[j].Length == str[smallIndex].Length)
                    {
                        for ( int k = 0; k < str[smallIndex].Length; k++)
                        {
                            if(str[j][k] < str[smallIndex][k])
                            {
                                smallIndex = j;
                            }
                        }
                    }
                }
                smallChange(i, smallIndex);
            }

            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(str[i]);
            }
        }

        static void smallChange(int first, int second)
        {
            string temp = "";
            temp = str[first];
            str[first] = str[second];
            str[second] = temp;
        }
    }
}
