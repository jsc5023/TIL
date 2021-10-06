using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Example11279
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
}

// 우선순위큐 github참조
public class PriorityQueue<T> where T : IComparable<T> {
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
            if (data[ci].CompareTo(data[pi]) <= 0)
                break; // child item is larger than (or equal) parent so we're done
            T tmp = data[ci];
            data[ci] = data[pi];
            data[pi] = tmp;
            ci = pi;
        }
    }

    public T Dequeue()
    {
        int li = data.Count - 1; // last index (before removal)
        T frontItem = data[0];   // fetch the front
        data[0] = data[li];
        data.RemoveAt(li);

        --li; // last index (after removal)
        int pi = 0; // parent index. start at front of pq
        while (true)
        {
            int ci = pi * 2 + 1; // left child index of parent
            if (ci > li)
                break;  // no children so done
            int rc = ci + 1;     // right child
            if (rc <= li && data[rc].CompareTo(data[ci]) > 0) // if there is a rc (ci + 1), and it is smaller than left child, use the rc instead
                ci = rc;
            if (data[pi].CompareTo(data[ci]) >= 0)
                break; // parent is smaller than (or equal to) smallest child so done
            T tmp = data[pi];
            data[pi] = data[ci];
            data[ci] = tmp; // swap parent and child
            pi = ci;
        }
        return frontItem;
    }

    public int Count()
    {
        return data.Count;
    }
}