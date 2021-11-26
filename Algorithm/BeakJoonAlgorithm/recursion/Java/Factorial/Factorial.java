import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.print(factorial(N));
	}
	
	public static int factorial(int number) {
		int answer = 1;
		if(number == 0)
			answer = 1;
		else
			answer = factorial(number - 1) * number;
		return answer;
	}

}
