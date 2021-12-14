
public class TargetNumber {

	public static int answer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.print(solution(numbers, target));
	}
	
	public static int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
	 
	public static void dfs(int[] numbers, int target, int idx, int sum) {
		// 인터넷 참조풀이, 한번 다시 푼 풀이입니다.
		
		if(idx == numbers.length) {
			if(target == sum)
				answer++;
			return;
		}
		
		sum += numbers[idx];
		
		dfs(numbers, target, idx + 1, sum);
		
		sum -= (numbers[idx] * 2); // 초기값에서 +numbers[idx] 되어있으므로, 원래값에서 -numbers[idx]를 할려면 2번 빼줘야 한다.
		
		dfs(numbers, target, idx + 1, sum);
	}

}
