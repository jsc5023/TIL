import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example10866 {
	
	static int front = 10000; // front�� Index
	static int back = 10000; // back�� Index
	static int dequeSize = 0; // ���� deque�� ������
	static int[] deque = new int[20001]; // ó������ �߾ӿ��� ���۵˴ϴ�.
	
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
		deque[front] = num; // front�� ��(�ʱⰪ�ϰ�� 10000�� ������ front�� ���� ���� (�̷��� deque�� size�� 1�� ���, front�� back�� ���� �����Ƿ�)
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
