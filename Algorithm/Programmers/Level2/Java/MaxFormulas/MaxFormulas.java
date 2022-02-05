
public class MaxFormulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "100-200*300-500+20";
		System.out.print(solution(expression));
	}
	
	public static long solution(String expression) {
        long answer = Long.MIN_VALUE;
        // 우선순위정하기
        // 1. + , - , *
        // 2. + , * , -
        // 3. *, +, -
        // 4. *, -, +
        // 5. -, * , +
        // 6. -, +, *
        
        for (int i = 0; i < expression.length(); i++) {
			answer = findExpression(i, expression, answer);
		}
        
        return answer;
    }
	
	public static long findExpression(int i, String expression, long answer) {
		
		if(i == 0) {
			String[] plusString = expression.split("+");
			
			
		}
		
		return 0;
	}

}
