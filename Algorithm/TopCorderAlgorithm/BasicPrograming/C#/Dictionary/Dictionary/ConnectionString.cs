using System;
using System.Collections.Generic;
namespace Dictionary
{
    class ConnectionString
    {
        static void countString(string[] s)
        {
            Dictionary<string, int> dic = new Dictionary<string, int>();
            for (int i = 0; i < s.Length; i++)
            {
                if (!dic.ContainsKey(s[i])) dic[s[i]] = 0;
                dic[s[i]]++;
            }

            foreach (KeyValuePair<string, int> item in dic)
            {
                Console.WriteLine(item.Key + " " + item.Value);
            }
        }
        static void Main(string[] args)
        {
            string[] MyString = { "Hello", "My", "String", "Hello" };
            countString(MyString);
        }
    }
}
