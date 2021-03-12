using System;

namespace Program
{
    class KiwiJuiceEasy
    {
        public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId)
        {
            
            for (int i = 0; i < fromId.Length; i++)
            {
                int f = fromId[i]; // 현재 병번호
                int t = toId[i]; // 추가하는 병 번호
                int space = capacities[t] - bottles[t];
                if(space >= bottles[f]) // 원래 
                {
                    bottles[t] = bottles[t] + bottles[f];
                    bottles[f] = 0;
                }
                else
                {
                    bottles[f] = bottles[t] + bottles[f] - capacities[t];
                    bottles[t] = capacities[t];
                }
            }

            return bottles;
        }
        static void Main(string[] args)
        {
            //int[] capacities = { 20, 20 };
            //int[] bottles = { 5, 8 };
            //int[] fromId = { 0 };
            //int[] toId = { 1 };

            //int[] capacities = { 10, 10 };
            //int[] bottles = { 5, 8 };
            //int[] fromId = { 0 };
            //int[] toId = { 1 };

            //int[] capacities = { 30, 20, 10 };
            //int[] bottles = { 10, 5, 5 };
            //int[] fromId = { 0, 1, 2 };
            //int[] toId = { 1, 2, 0 };

            int[] capacities = { 700000, 800000, 900000, 1000000 };
            int[] bottles = { 478478, 478478, 478478, 478478};
            int[] fromId = { 2, 3, 2, 0, 1 };
            int[] toId = { 0, 1, 1, 3, 2 };


            // Example 0 capacities = {20. 20}, bottles {5, 8}, fromId = {0}, toId = {1}, Returns : {0. 13} 
            // Example 1 capacities = {10. 10}, bottles {5, 8}, fromId = {0}, toId = {1}, Returns : {3. 10} 
            // Example 2 capacities = {30. 20, 10}, bottles {10, 5, 5}, fromId = {0,1,2}, toId = {1,2,0}, Returns : {10, 10, 0} 
            // Example 3 capacities = {14. 35, 86, 48, 25, 62}, bottles {6, 34, 27, 38, 9, 60}, fromId = {1, 2, 4, 5, 3, 3, 1, 0}, toId = {0, 1, 2, 4, 2, 5, 3, 1}, Returns : {0, 14, 65, 35, 25, 35} 
            // Example 4 capacities = {700000, 800000, 900000, 1000000}, bottles {478478, 478478, 478478, 478478}, fromId = {2, 3, 2, 0, 1}, toId = {0, 1, 1, 3, 2}, Returns : {0, 156956, 900000, 856956} 
            int[] value = thePouring(capacities, bottles, fromId, toId);
            for (int i = 0; i < bottles.Length; i++)
            {
                Console.WriteLine(value[i].ToString());
            }
        }
    }
}
