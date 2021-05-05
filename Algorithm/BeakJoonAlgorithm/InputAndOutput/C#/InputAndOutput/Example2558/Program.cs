using System;
// C#에서는 1000과 다른점이, 줄이 바뀐것이랑 띄워쓰기를 한것의 차이는 Split을 해야하나, 안해야하나의 차이가 있다. 따라서 이렇게 써야된다.
namespace Example2558
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            Console.WriteLine(a + b);
        }
    }
}
