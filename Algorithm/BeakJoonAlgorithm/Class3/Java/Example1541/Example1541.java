import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] minusStr = str.split("-");
		
		int sum = 0;
		
		for (int i = 0; i < minusStr.length; i++) {
			int plusSum = 0;
			String[] plusStr = minusStr[i].split("\\+");
			
			for (int j = 0; j < plusStr.length; j++) {
				plusSum += Integer.parseInt(plusStr[j]);
			}
			
			if(i == 0)
				sum += plusSum;
			else
				sum -= plusSum;
		}
		
		System.out.print(sum);
	}

}
