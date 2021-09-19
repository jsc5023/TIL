import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Example1874 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		StringBuilder sb = new StringBuilder();
		
		int start = 0;
        for (int i = 0; i < n; i++)
        {
            int inputStack = Integer.parseInt(br.readLine()); // ���ð��� ����

            if (inputStack > start)
            {
                for (int j = start + 1; j <= inputStack; j++)
                {
                    stack.push(j); // start���� ���°����� push�� �մϴ�.(input�� ���� stack�� ����ִ� ������ Ŭ���)
                    sb.append("+").append("\n");
                }
                start = inputStack;
            }

            else if (stack.peek() != inputStack)
            {
                System.out.print("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");

        }

        System.out.print(sb.toString());
	}

}
