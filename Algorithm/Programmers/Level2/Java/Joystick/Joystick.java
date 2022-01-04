
public class Joystick {

	static String nowAlpha = "A";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JAN";
		System.out.print(solution(name));
	}
	
	 public static int solution(String name) {
		 int answer = 0;
		 int len = name.length();
		 
		 int min = len - 1;
		 
		 for (int i = 0; i < len; i++) {
			
			// Á¶ÀÌ½ºÆ½ »ó, ÇÏ ÀÌµ¿
			char nowChar = name.charAt(i);
			int mov = (nowChar - 'A' < 'Z' - nowChar + 1) ? (nowChar - 'A') : ('Z' - nowChar + 1);
			answer += mov;
			
			// Á¶ÀÌ½ºÆ½ ÁÂ¿ìÀÌµ¿
			int nextIndex = i + 1;
			while(nextIndex < len && name.charAt(nextIndex) == 'A') {
				nextIndex++;
			}
			
			min = Math.min(min, (i*2) + len - nextIndex);
			
		}
		 
		answer += min;
		return answer;
    }

}
