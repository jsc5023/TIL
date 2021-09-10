using System;
using System.Text;

namespace Example10845
{
    class Program
    {
        static int[] queue;
        static int pushIndex = 0; // push(들어온) 인덱스
        static int popIndex = 0; // pop(나간) 인덱스
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            queue = new int[N];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++)
            {
                string[] str = Console.ReadLine().Split(' ');
                switch (str[0])
                {
                    case "push":
                        queue[pushIndex] = int.Parse(str[1]);
                        pushIndex++;
                        break;
                    case "pop":
                        if (pushIndex == popIndex)
                            sb.Append(-1).Append("\n");
                        else
                            sb.Append(queue[popIndex++]).Append("\n");
                        break;

                    case "size":
                        sb.Append(pushIndex - popIndex).Append("\n");
                        break;

                    case "empty":
                        if (pushIndex - popIndex == 0)
                            sb.Append(1).Append("\n");
                        else
                            sb.Append(0).Append("\n");
                        break;

                    case "front":
                        if (pushIndex - popIndex == 0)
                            sb.Append(-1).Append("\n");
                        else
                            sb.Append(queue[popIndex]).Append("\n");
                        break;

                    case "back":
                        if (pushIndex - popIndex == 0)
                            sb.Append(-1).Append("\n");
                        else
                            sb.Append(queue[pushIndex - 1]).Append("\n");
                        break;
                }
            }

            Console.Write(sb);

        }
    }
}
