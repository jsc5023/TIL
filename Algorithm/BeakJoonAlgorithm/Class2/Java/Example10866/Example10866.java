import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example10866 {
	
	static int front = 10000; // front의 Index
	static int back = 10000; // back의 Index
	static int dequeSize = 0; // 현재 deque의 사이즈
	static int[] deque = new int[20001]; // 처음값은 중앙에서 시작됩니다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]){
				case "push_front":
					push_front(Integer.parseInt(str[1]));
					break;
					
				case "push_back":
					push_back(Integer.parseInt(str[1]));
					break;
				
				case "pop_front":
					sb.append(pop_front()).append("\n");
					break;
					
				case "pop_back":
					sb.append(pop_back()).append("\n");
					break;
					
				case "size":
					sb.append(size()).append("\n");
					break;
					
				case "empty":
					sb.append(empty()).append("\n");
					break;
					
				case "front":
					sb.append(front()).append("\n");
					break;	
					
				case "back":
					sb.append(back()).append("\n");
					break;	
			}
		}
		
		System.out.print(sb.toString());
	}
	
	static void push_front(int num) {
		deque[front] = num; // front의 값(초기값일경우 10000을 넣은뒤 front의 값을 뺀다 (이래야 deque의 size가 1일 경우, front와 back의 값이 같으므로)
		front--;
		dequeSize++;
	}
	
	static void push_back(int num) {
		back++;
		deque[back] = num;
		dequeSize++;
	}
	
	static int pop_front() {
		if(dequeSize == 0)
			return -1;
		else {
			int result = 0;
			front++;
			result = deque[front];
			dequeSize--;
			return result;
		}	
	}
	
	static int pop_back() {
		if(dequeSize == 0)
			return -1;
		else {
			int result = 0;
			result = deque[back];
			back--;
			dequeSize--;
			return result;
		}	
	}
	
	static int size() {
		return dequeSize;
	}
	
	static int empty() {
		if(dequeSize == 0)
			return 1;
		else
			return 0;
	}
	
	static int front() {
		if(dequeSize == 0)
			return -1;
		else {
			return deque[front+1];
		}
	}
	
	static int back() {
		if(dequeSize == 0)
			return -1;
		else {
			return deque[back];
		}
	}
}
