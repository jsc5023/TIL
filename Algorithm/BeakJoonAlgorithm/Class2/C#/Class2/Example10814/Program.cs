using System;
using System.Text;

namespace Example10814
{
    class Human
    {
        public static int indexer;
        int age;
        string name;

        public int index;

        public Human(int age, string name)
        {
            this.age = age;
            this.name = name;
            this.index = Human.indexer++;
        }

        public int Age{
            get { return this.age; }
        }

        public string Name{
            get { return this.name; }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            Human[] humans = new Human[N];
            string[,] humanArr = new string[2, N];
            for (int i = 0; i < N; i++)
            {
                string[] str = Console.ReadLine().Split(' ');
                humans[i] = new Human(int.Parse(str[0]), str[1]);
            }

            Array.Sort(humans, delegate (Human a, Human b)
            {
                
                if (a.Age > b.Age)
                    return 1;
                else if (a.Age == b.Age)
                    return a.index - b.index;
                return -1;
            });

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++)
            {
                sb.Append(humans[i].Age).Append(" ").Append(humans[i].Name).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
