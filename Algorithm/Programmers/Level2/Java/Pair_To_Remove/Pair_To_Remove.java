import java.util.Stack;

public class Pair_To_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baabaa";
		System.out.print(solution(s));
	}
	
	public static int solution(String s)
    {
		// ��Ǯ��, �������� Ǫ�¹���, ������ �ƴϸ�, �����̾ȳ���
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char nowChar = s.charAt(i);
			
			if(!stack.isEmpty() && stack.peek() == nowChar)
				stack.pop();
			else
				stack.push(nowChar);
		}
		
		return stack.isEmpty() ? 1 : 0;
    }

}
