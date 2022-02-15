import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MenuRenewal {

	public static HashMap<String, Integer> map;
	static int max;
	
	public static void main(String[] args) {
		// https://gwang920.github.io/algorithm/progreammers-1-72411/ ÂüÁ¶
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		System.out.print(solution(orders, course));
	}
	
	public static String[] solution(String[] orders, int[] course) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        
        for (int i = 0; i < course.length; i++) {
        	map = new HashMap<>();
        	max = 0;
        	for (int j=0;j<orders.length;j++) {
                find(0, "", course[i], 0, orders[j]);
            }
        	
        	for (String s : map.keySet()){
                 if (map.get(s)==max && max>1){
                     queue.offer(s);
                 }
            }
        }
        
        String answer[] = new String[queue.size()];
        int k=0;
        while (!queue.isEmpty()){
        	answer[k++] = queue.poll();
        }
        
        return answer;
    }
	
	 public static void find(int cnt,String str,int targetNum,int idx,String word){
		if(cnt == targetNum) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String temps = "";
			for (int i = 0; i < ch.length; i++) {
				temps += ch[i];
			}
			map.put(temps, map.getOrDefault(temps, 0) + 1);
			max = Math.max(max, map.get(temps));
			return;
		}
		
		for (int i=idx;i<word.length();i++){
            char now =word.charAt(i);
            find(cnt+1,str+now,targetNum,i+1,word);
        }
    }

}
