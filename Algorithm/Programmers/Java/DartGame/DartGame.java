
public class DartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1D2S#10S";
		
		System.out.print(solution(dartResult));
	}
	
	public static int solution(String dartResult) {
		char[] darts = dartResult.toCharArray();
		int[] score = new int[3];
		int index = -1;
		for (int i = 0; i < darts.length; i++) {
			if(darts[i] >= '0' && darts[i] <= '9') {
				index++;
				if(darts[i] == '1' && darts[i + 1] == '0') {
					score[index] = 10;
					i++;
				}
				else {
					score[index] = darts[i] - '0';
				}
			} // S는 1배이므로 생략한다.
			else if(darts[i] == 'D') {
				score[index] = (int)Math.pow(score[index], 2);
			}
			else if(darts[i] == 'T') {
				score[index] = (int)Math.pow(score[index], 3);
			}
			else if(darts[i] == '*') {
				if(index >= 1) {
					score[index - 1] *= 2; 
				}
				score[index] *= 2; 
			}
			else if(darts[i] == '#') {
				score[index] *= -1; 
			}
		}
		
		return score[0] + score[1] + score[2];
    }

}
