import java.util.Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		
		String s = "-1 -2 -3 -4";
		System.out.print(solution(s));
	}

	public static String solution(String s) {
		String[] str = s.split(" ");
		
		int[] answerInt = new int[str.length];
		
		for (int i = 0; i < str.length; i++) {
			answerInt[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(answerInt);
		
		String min = Integer.toString(answerInt[0]);
		String max = Integer.toString(answerInt[str.length - 1]);
        return min + " " + max;
	}
}
