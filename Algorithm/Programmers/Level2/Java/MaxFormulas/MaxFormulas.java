import java.util.ArrayList;

public class MaxFormulas {

	static char[] prior = {'+', '-', '*'};
    static boolean[] check = new boolean[3];
    static ArrayList<Long> nums = new ArrayList<Long>();
    static ArrayList<Character> ops = new ArrayList<Character>();
    static long answer;
    
    static char[] operator = {'+', '-', '*'};
    
	public static void main(String[] args) {
		// 참조 https://asong-study-record.tistory.com/83 참조
		// 혼자못풀어서, 참조함, 주석 및 재풀이 필요
		String expression = "100-200*300-500+20";
		System.out.print(solution(expression));
	}
	
	public static long solution(String expression) {
		answer = 0;

		String num = "";
		for (int i = 0; i < expression.length(); i++) {
			char nowChar = expression.charAt(i);
			if(nowChar >= '0' && nowChar <= '9') {
				num += nowChar;
			}
			else {
				nums.add(Long.parseLong(num));
				num = "";
				ops.add(expression.charAt(i));
			}
		}
		nums.add(Long.parseLong(num));
		dfs(0, new char[3]);
		
        return answer;
    }
	
	 public static void dfs(int count, char[] op){
        if(count == 3){
            ArrayList<Long> cNums = new ArrayList<>(nums);
            ArrayList<Character> cOps = new ArrayList<Character>(ops);

            for(int i=0;i<op.length;i++){
                for(int j=0; j< cOps.size(); j++){
                    if(op[i] == cOps.get(j)){
                        Long res = findExpression(cNums.remove(j), cNums.remove(j), op[i]);
                        cNums.add(j, res);
                        cOps.remove(j);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(cNums.get(0)));
            return;

        }
        
        for (int i = 0; i < op.length; i++) {
			if(!check[i]) {
				check[i] = true;
				op[count] = prior[i];// 연산자
				dfs(count + 1, op);
				check[i] = false;
			}
		}
    }
	 
	 public static long findExpression(Long num1, Long num2, char op) {
		long num = 0;
        switch (op){
            case '+' : {
                return num1 + num2;
            }
            case '-' : {
                return num1 - num2;
            }
            case '*' : {
                return num1 * num2;
            }
        }
        return num;
	}

}
