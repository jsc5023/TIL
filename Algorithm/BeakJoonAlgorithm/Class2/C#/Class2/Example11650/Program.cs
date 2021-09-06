using System;
using System.Text;

namespace Example11650
{
    class Program
    {
        public class XY{
            int x;
            int y;

            public XY(int x, int y)
            {
                this.x = x;
                this.y = y;
            }

            public int X
            {
                get { return this.x; }
            }

            public int Y
            {
                get { return this.y; }
            }
        }
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            XY[] xy = new XY[N];

            for (int i = 0; i < N; i++)
            {
                string[] str = Console.ReadLine().Split(' ');
                xy[i] = new XY(int.Parse(str[0]), int.Parse(str[1]));
            }

            Array.Sort(xy, delegate (XY a1, XY a2)
            {
                if(a1.X < a2.X)
                {
                    return -1;
                }
                else if(a1.X == a2.X)
                {
                    if(a1.Y < a2.Y)
                    {
                        return -1;
                    }
                }
                return 1;
            });

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++)
            {
                sb.Append(xy[i].X).Append(" ").Append(xy[i].Y).Append("\n");
            }

            Console.Write(sb);
        }
    }
}
