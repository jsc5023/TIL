
public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brown = 24;
		int yellow = 24;
		
		System.out.print(solution(brown, yellow));
	}

	public static int[] solution(int brown, int yellow) {
        
		//
		int[] answer = new int[2];
		
		int area = brown + yellow;
 
		for (int i = 1; i <= area; i++) {
			int row = i;
			int col = area / row;
			
			if(row > col)
				continue;
			
			if((row - 2) * (col - 2) == yellow) {
				answer[0] = col;
				answer[1] = row;
				return answer;
			}
		}
		
        return answer;
    }
}
