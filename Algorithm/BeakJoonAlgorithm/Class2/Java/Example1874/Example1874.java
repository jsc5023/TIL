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
            int inputStack = Integer.parseInt(br.readLine()); // 스택값이 들어옴

            if (inputStack > start)
            {
                for (int j = start + 1; j <= inputStack; j++)
                {
                    stack.push(j); // start부터 들어온값까지 push를 합니다.(input이 현재 stack에 들어있는 값보다 클경우)
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
