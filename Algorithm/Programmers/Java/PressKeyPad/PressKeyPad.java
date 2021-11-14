
public class PressKeyPad {

	static int[] leftPosition = {3, 0};
	static int[] rightPosition = {3, 2};
	static int[][] keyPad = {{1,2,3}, {4,5,6}, {7,8,9}, {10, 0, 11}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "right";
		
		System.out.print(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        for (int i = 0; i < numbers.length; i++) {
        	answer += findHand(numbers[i], hand);
		}
        
        return answer;
    }
	
	public static String findHand(int number, String hand) {
		
		String reulstHand = "";
		
		switch (number) {
			// ¿ÞÂÊ
			case 1:
				reulstHand = "L";
				leftPosition[0] = 0;
				leftPosition[1] = 0;
				break;
			case 4:
				reulstHand = "L";
				leftPosition[0] = 1;
				leftPosition[1] = 0;
				break;
			case 7:
				reulstHand = "L";
				leftPosition[0] = 2;
				leftPosition[1] = 0;
				break;
				
			case 2:
				reulstHand = middlePositionNumber(0, 1, hand);
				break;
			case 5:
				reulstHand = middlePositionNumber(1, 1, hand);
				break;
			case 8:
				reulstHand = middlePositionNumber(2, 1, hand);
				break;
			case 0:
				reulstHand = middlePositionNumber(3, 1, hand);
				break;
				
			// ¿À¸¥ÂÊ
			case 3:
				reulstHand = "R";
				rightPosition[0] = 0;
				rightPosition[1] = 2;
				break;
			case 6:
				reulstHand = "R";
				rightPosition[0] = 1;
				rightPosition[1] = 2;
				break;
			case 9:
				reulstHand = "R";
				rightPosition[0] = 2;
				rightPosition[1] = 2;
				break;
		}
		return reulstHand;
	}
	
	public static String middlePositionNumber(int xPosition, int yPosition, String hand) {
		
		String reulstHand = "";
		
		int leftPositionLength = 0;
		int rightPositionLength = 0;
		
		leftPositionLength = Math.abs(leftPosition[0] - xPosition) + Math.abs(leftPosition[1] - yPosition);
		rightPositionLength = Math.abs(Math.abs(rightPosition[0] - xPosition) + Math.abs(rightPosition[1] - yPosition));
		if(rightPositionLength > leftPositionLength) {
			reulstHand = "L";
			leftPosition[0] = xPosition;
			leftPosition[1] = yPosition;
		}
		else if(rightPositionLength == leftPositionLength) {
			if(hand == "right") {
				reulstHand = "R";
				rightPosition[0] = xPosition;
				rightPosition[1] = yPosition;
			}
			else {
				reulstHand = "L";
				leftPosition[0] = xPosition;
				leftPosition[1] = yPosition;
			}
		}
		else {
			reulstHand = "R";
			rightPosition[0] = xPosition;
			rightPosition[1] = yPosition;
		}
		
		return reulstHand;
	}
}
