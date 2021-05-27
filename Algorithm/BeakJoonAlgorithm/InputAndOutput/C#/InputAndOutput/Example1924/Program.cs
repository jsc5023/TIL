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

        public static int MonthToDay(int month)
        {
            int day = 0;
            
            if (month > 1)
                day += 31;
            if (month > 2)
                day += 28;
            if (month > 3)
                day += 31;
            if (month > 4)
                day += 30;
            if (month > 5)
                day += 31;
            if (month > 6)
                day += 30;
            if (month > 7)
                day += 31;
            if (month > 8)
                day += 31;
            if (month > 9)
                day += 30;
            if (month > 10)
                day += 31;
            if (month > 11)
                day += 30;

            return day;
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split();

            int x = int.Parse(input[0]);
            int y = int.Parse(input[1]);
            
            int nowDay = (MonthToDay(x) + y) % 7;

            string nowDayString = FindDayString(nowDay);


            Console.Write(nowDayString);
        }
    }
}
