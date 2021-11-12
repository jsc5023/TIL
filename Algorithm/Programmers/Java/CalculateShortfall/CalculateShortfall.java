public class CalculateShortfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 3;
		int money = 20;
		int count = 4;
		
		System.out.print(solution(price, money, count));
	}
	
	 public static long solution(int price, int money, int count) {
        long answer = -1;
        
        long multiResult = 0;
        for (int i = 1; i <= count; i++) {
			multiResult += price * i;
		}
        answer = multiResult - money;
        
        answer = answer > 0 ? answer : 0;
        return answer;
    }

}
