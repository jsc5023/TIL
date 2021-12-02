import java.util.HashMap;
import java.util.Map;

public class Camouflage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.print(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		
		Map<String, Integer> map = new HashMap<>();
		
		int cnt = 1;
		
		for (int i = 0; i < clothes.length; i++) {
			if(map.containsKey(clothes[i][1]))
				map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
			else
				map.put(clothes[i][1], 1);
		}
		
		for (int item : map.values()) {
			cnt *= item + 1;
		}
		
		return cnt - 1;
    }
	 
}
