import java.util.HashSet;
import java.util.Iterator;

public class FindPrimeNumber {

	static HashSet<Integer> numbersSet = new HashSet<>();

	public static void main(String[] args) {
		String numbers = "17";
		
		System.out.print(solution(numbers));
	}
	
	public static int solution(String numbers) {
        int answer = 0;
        
        int[] dp = new int[100000001];
        
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; (i*i)<=10000000; i++){
			if(dp[i] == 0){
				for(int j = i*i; j<=10000000; j+=i) 
					dp[j] = 1;
			}
		} // 0인게 소수로 맞춤
        
        recursive("", numbers); 
        
		Iterator<Integer> it = numbersSet.iterator(); 
		
		while (it.hasNext()) { 
			int number = it.next(); 
			if (dp[number] == 0) 
				answer++; 
		}
        
        return answer;
    }
	
	public static void recursive(String comb, String others) { 
		
		if (!comb.equals("")) 
			numbersSet.add(Integer.valueOf(comb)); 
		
		for (int i = 0; i < others.length(); i++) {
			recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1)); 
		}
	}

}
