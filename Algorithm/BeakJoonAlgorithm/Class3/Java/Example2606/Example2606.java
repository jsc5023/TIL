import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Example2606 {

	static int node[][]; // ���(��ǻ��) - C#������ ��ǻ�ͷ� ǥ��, ���⼭�� ���ǻ�(�ٸ������� �̷������� Ǯ��ߵǹǷ� �̷��� ����)
	static int check[]; // ���� �� ��忡 �湮�ߴ��� üũ
	
	public static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<>();
		
		check[n] = 1;
		queue.offer(n);
		int cnt = 0;
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for (int i = 1; i < node.length; i++) {
				if(node[temp][i] == 1 && check[i] != 1) {
					queue.offer(i);
					check[i] = 1;
					cnt++;
				}
			}
		}
		
		System.out.print(cnt);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int computers = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		node = new int[computers + 1][computers + 1];
		check = new int[computers + 1];
		
		for (int i = 0; i < e; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			node[v1][v2] = 1;
			node[v2][v1] = 1;
		}
		
		bfs(1);
	}

}
