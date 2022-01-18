
public class Another_bit {

	public static void main(String[] args) {
		long[] numbers = {2, 7};
		solution(numbers);
	}

	public static long[] solution(long[] numbers) {
		// ���� ����� ���ϱ�, �ܼ� �ݺ������δ� Ǯ �� ���� �����̴�.
		// Ȧ��, ¦���� �����Ͽ� ¦���� ���, Ȧ���ϰ�� �� �� ������ ������ �ؾߵȴ�.
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
        	answer[i] = findBit(numbers[i]);
		}
        
        return answer;
    }
	
	public static long findBit(long number) {
		
		long result = number;
		String numberBinary = Long.toBinaryString(number);
		
		if(number % 2 == 0)
			return result+1;
		else{
            int lastindex =  numberBinary.lastIndexOf("0");
            int firstindex = numberBinary.indexOf("1",lastindex);
            if(lastindex==-1){
                result+=1;
                numberBinary =  Long.toBinaryString(result);
                numberBinary = numberBinary.substring(0,2)+
                		numberBinary.substring(2,numberBinary.length()).replace("0","1");

            }else{
            	numberBinary = numberBinary.substring(0,lastindex)+"1"+
            			numberBinary.substring(lastindex+1,firstindex)+"0"+
            			numberBinary.substring(firstindex+1,numberBinary.length());
            }
        
            result = Long.parseLong(numberBinary,2); // �������� ��ȯ
        }
	
		return result;
	}
}
