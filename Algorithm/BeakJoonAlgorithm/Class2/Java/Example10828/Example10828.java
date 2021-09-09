import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example10828 {
	
	static int[] stack;
	static int nowIndex = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			
			String command = str[0];
			if(command.equals("push"))
				push(Integer.parseInt(str[1]));
			else if(command.equals("pop"))
				sb.append(pop()).append("\n");
			else if(command.equals("size"))
				sb.append(size()).append("\n");
			else if(command.equals("empty"))
				sb.append(empty()).append("\n");
			else if(command.equals("top"))
				sb.append(top()).append("\n");
		}
		
		System.out.print(sb.toString());
	}
	
	static void push(int inputNum) {
		stack[nowIndex] = inputNum;
		nowIndex++;
	}
	
	static int pop() {
		if(nowIndex == 0) {
			return -1;
		}
		else {
			int result = stack[nowIndex - 1];
			nowIndex--;
			return result;
		}
	}
	
	static int size() {
		return nowIndex;
	}
	
	static int empty() {
		if(nowIndex == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	static int top() {
		if(nowIndex == 0) {
			return -1;
		}
		else {
			return stack[nowIndex - 1];
		}
	}
}
