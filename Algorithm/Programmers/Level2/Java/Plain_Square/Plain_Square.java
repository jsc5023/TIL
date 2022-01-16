import java.math.BigInteger;

public class Plain_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 8;
		int h = 12;
		System.out.print(solution(w, h));
		
	}

	public static long solution(int w, int h) {
		long answer = (long)w * (long)h;
        long gcd_v = gcd(w,h);
        answer = answer - (gcd_v * ((w/gcd_v) + (h/gcd_v) -1));
        
        return answer;
    }
	
	public static long gcd(long a, long b) {
		long val_1 = a > b ? a: b;
		long val_2 = a > b ? b: a;
		
		while(val_2 != 0) {
			long r = val_1 % val_2;
			val_1 = val_2;
			val_2 = r;
		}
		return val_1;
	}
	 
}
