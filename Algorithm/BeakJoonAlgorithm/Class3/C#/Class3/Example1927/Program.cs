using System;
using System.Collections.Generic;
using System.Text;

namespace Example1927
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            PriorityQueue<int> queue = new PriorityQueue<int>();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++)
            {
                int x = int.Parse(Console.ReadLine());
                if (x == 0)
                {
                    if (queue.Count() == 0)
                        sb.Append(0).Append("\n");
                    else
                    {
                        sb.Append(queue.Dequeue()).Append("\n");
                    }
                }
                else
                    queue.Enqueue(x);
            }

            Console.Write(sb);
        }
    }


    // 우선순위큐 github참조
    public class PriorityQueue<T> where T : IComparable<T>
    {
        private List<T> data;

        public PriorityQueue()
        {
            this.data = new List<T>();
        }

        public void Enqueue(T item)
        {
            data.Add(item);
            int ci = data.Count - 1;
            while (ci > 0)
            {
                int pi = (ci - 1) / 2;
                if (data[ci].CompareTo(data[pi]) >= 0)
                    break;
                T tmp = data[ci];
                data[ci] = data[pi];
                data[pi] = tmp;
                ci = pi;
            }
        }

        public T Dequeue()
        {
           
            int li = data.Count - 1; 
            T frontItem = data[0];   
            data[0] = data[li];
            data.RemoveAt(li);

            --li;
            int pi = 0;
            while (true)
            {
                int ci = pi * 2 + 1;
                if (ci > li)
                    break;
                int rc = ci + 1; 
                if (rc <= li && data[rc].CompareTo(data[ci]) < 0)
                    ci = rc;
                if (data[pi].CompareTo(data[ci]) <= 0)
                    break;
                T tmp = data[pi];
                data[pi] = data[ci];
                data[ci] = tmp;
                pi = ci;
            }
            return frontItem;
        }

        public int Count()
        {
            return data.Count;
        }
    }
}
