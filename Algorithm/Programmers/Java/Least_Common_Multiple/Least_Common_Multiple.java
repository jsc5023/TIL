import java.util.Arrays;
import java.util.Iterator;

public class Least_Common_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,8,14};
		
		System.out.print(solution(arr));
	}
	
	public static int solution(int[] arr) {
		
		Arrays.sort(arr);
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Lcm(arr[i], arr[i-1]);
		}
		
		arr[0] = 1;
		
		int ans = 1;
		for (int i = 1; i < arr.length; i++) {
			ans = Math.max(ans, arr[i]);
		}
		
		return ans;
	}
	
	public static int Lcm(int a, int b) {
		  return (a * b) / Gcd(a, b);
	}
	
	public static int Gcd(int a, int b) {
		int r = a % b;
		if (r == 0)
			return b;
		else
			return Gcd(b, r);
	}

}
