import java.math.BigInteger;

public class Plain_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 8;
		int h = 12;
		System.out.print(solution(w, h));
		
	}

	public static long solution(int w, int h) {
        // ������� �ڸ� �� ������ ����غ���
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }
}
