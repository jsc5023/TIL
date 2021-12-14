
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
		// ���ͳ� ����Ǯ��, �ѹ� �ٽ� Ǭ Ǯ���Դϴ�.
		
		if(idx == numbers.length) {
			if(target == sum)
				answer++;
			return;
		}
		
		sum += numbers[idx];
		
		dfs(numbers, target, idx + 1, sum);
		
		sum -= (numbers[idx] * 2); // �ʱⰪ���� +numbers[idx] �Ǿ������Ƿ�, ���������� -numbers[idx]�� �ҷ��� 2�� ����� �Ѵ�.
		
		dfs(numbers, target, idx + 1, sum);
	}

}
