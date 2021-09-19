import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Example1929 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		
		int N = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> resultArrayList = eratos();
		
		int i = 0;
		while(true) {
			
			int prime = resultArrayList.get(i);
			if(N < prime) {
				break;
			}
			else if(M <= prime)
				sb.append(prime).append("\n");
			
			i++;
		}
		
		System.out.print(sb.toString());
		
	}
	
	public static ArrayList<Integer> eratos() {
		
		int max = 1000000;
		
		ArrayList<Boolean> arrayPrimeCheck = new ArrayList<Boolean>();
		ArrayList<Integer> arrayPrimeNum = new ArrayList<Integer>();
		
		// 0 , 1을 우선 false로 선언
		arrayPrimeCheck.add(false);
		arrayPrimeCheck.add(false);
		
		for (int i = 2; i <= max; i++)
			arrayPrimeCheck.add(i, true);
		
		for (int i = 2; (i*i) <= max; i++) {
			
			if(arrayPrimeCheck.get(i)) {
				for (int j = i*i; j <= max; j += i) {
					arrayPrimeCheck.set(j, false);
				}
			}
				
		}
		
		for (int i = 0; i <= max; i++) {
			if(arrayPrimeCheck.get(i) == true)
				arrayPrimeNum.add(i);
		}
		
		return arrayPrimeNum;
	}

}
