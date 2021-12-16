
public class BinaryTransformRepeat {

	public static int repeatNum = 0;
	public static int delete0 = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "110010101001";
		
		System.out.print(solution(s));
	}

	public static int[] solution(String s) {
        BinaryTransform(s);
        
        int[] answer = {repeatNum, delete0};
        
        return answer;
    }
	
	public static String BinaryTransform(String s) {
		
		String firstTrans = "";
		String secondTrans = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				firstTrans += s.charAt(i);
			}
			else {
				delete0++;
			}
		}
		
		int firstTransLength = firstTrans.length();
		
		secondTrans = Integer.toBinaryString(firstTransLength);
		
		repeatNum++;
		if(secondTrans.equals("1"))
			return secondTrans;
		else
			return BinaryTransform(secondTrans);
		
	}
}
