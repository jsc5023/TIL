import java.math.BigInteger;

public class Plain_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 8;
		int h = 12;
		System.out.print(solution(w, h));
		
	}

	public static long solution(int w, int h) {
        // 어떤식으로 자를 수 있을지 고민해보기
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }
}
