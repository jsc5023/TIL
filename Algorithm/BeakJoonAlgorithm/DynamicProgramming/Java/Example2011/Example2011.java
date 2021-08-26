import java.util.Scanner;

public class Example2011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int divisionNum = 1000000;
		
		String n = sc.nextLine();
	
		if(n.charAt(0) == '0') {
			System.out.print('0');
			return;
		}
		
		long[] dp = new long[n.length() + 1];
		
		dp[0] = dp[1] = 1;
		
		for (int i = 1; i < n.length(); i++) {
			
			char firstNum = n.charAt(i - 1);
			
			if(n.charAt(i) >= '1' && n.charAt(i) <= '9') {
				dp[i+1] += dp[i];
				dp[i+1] %= divisionNum; // 
			}
			
			if(!(firstNum == '0' || firstNum > '2' || (firstNum == '2' && n.charAt(i) > '6')) ) {
				dp[i + 1] += dp[i - 1];
				dp[i + 1] %= divisionNum;
			}
		}
		
		System.out.print(dp[n.length()] % divisionNum);
		
	}

}
