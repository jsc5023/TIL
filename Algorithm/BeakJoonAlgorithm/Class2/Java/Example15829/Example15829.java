import java.util.Scanner;

public class Example15829 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		
		String str = sc.next();
		
		long pow = 1;
		long result = 0;
		long mod = 1234567891;
		for (int i = 0; i < length; i++) {
			result += (str.charAt(i) - 'a' + 1) * pow % mod;
			pow *= 31;
			pow %= mod;
		}
		
		System.out.print(result %= mod);
	}

}
