using System;

namespace Example1924
{
    class Program
    {
        public static string FindDayString(int nowDay)
        {
            string nowDayString = "";

            switch (nowDay)
            {
                case 0:
                    nowDayString = "SUM";
                    break;
                case 1:
                    nowDayString = "MON";
                    break;
                case 2:
                    nowDayString = "TUE";
                    break;
                case 3:
                    nowDayString = "WED";
                    break;
                case 4:
                    nowDayString = "THU";
                    break;
                case 5:
                    nowDayString = "FRI";
                    break;
                case 6:
                    nowDayString = "SAT";
                    break;
                default:
                    break;
            }

            return nowDayString;
        }
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split();

            int x = int.Parse(input[0]);
            int y = int.Parse(input[1]);

            int nowDay = y % 7;

            string nowDayString = FindDayString(nowDay);


            Console.Write(nowDayString);
        }
    }
}
