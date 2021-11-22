import java.util.HashMap;

public class NotExsitsNumbersSum {
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.print(solution(numbers));
	}
	
	public static int solution(int[] numbers) {
		
		int answer = 0;
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for (int i = 0; i < 10; i++) {
			map.put(i, true);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(map.containsKey(numbers[i]))
				map.replace(numbers[i], false);
		}
		
		for (int i = 0; i < 10; i++) {
			if(map.get(i))
				answer += i;
		}
		return answer;
		
	}
}
