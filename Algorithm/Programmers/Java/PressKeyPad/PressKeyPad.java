public class PressKeyPad {
	
	// https://zzang9ha.tistory.com/292 참조(계속 시도했는데 틀려서, 이해 및 재작성으로 사용함)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		System.out.print(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int leftIndex = 10;	 // '*' => 10으로 치환
		int rightIndex = 12; // '#' => 12로 치환
		
		for (int number : numbers) {
			if(number == 1 || number == 4 || number == 7) {
				sb.append("L");
				leftIndex = number;
			}
			else if(number == 3 || number == 6 || number == 9) {
				sb.append("R");
				rightIndex = number;
			}
			else {
				int leftLen = getLength(leftIndex, number);
				int rightLen = getLength(rightIndex, number);
				
				if(leftLen > rightLen) {
					sb.append("R");
					rightIndex = number;
				}
				else if(leftLen == rightLen) {
					if(hand.equals("left")) {
						sb.append("L");
						leftIndex = number;
					} else {
						sb.append("R");
						rightIndex = number;
					}
				}
				else {
					sb.append("L");
					leftIndex = number;
				}
			}
		}
		return sb.toString();
	}

	public static int getLength(int index, int number) {
		index = (index == 0) ? 11 : index;
		number = (number == 0) ? 11 : number;
		
		int x = (index - 1) / 3;
		int y = (index - 1) % 3;
		int numberX = number / 3;
		int numberY = 1;
		
		return Math.abs(x-numberX) + Math.abs(y-numberY);
	}
}
