import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PowerGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		System.out.print(solution(n, wires));
	}

	public static int solution(int n, int[][] wires) {
        int answer = 101;
        // 이문제는 한번씩 다시풀어보는데 햇갈림, 3일동안 풀어봐야됨, 내일 다시 안보고 풀어보기
        // 완전탐색으로 문제풀기
        int a1 = 0;
        int a2 = 0;
        for (int i = 0; i < wires.length; i++) {
			a1 = relationCnt(i, wires);
			a2 = n - a1;
			int total = Math.abs(a1 - a2);
			answer = Math.min(total, answer);
		}
        return answer;
    }
	
	public static int relationCnt (int idx, int[][] wires){
        
		// BFS 탐색
		Queue<Integer> queue = new LinkedList<>();
		List<int[]> list = new ArrayList<>();
		for (int[] data : wires) {
			list.add(data);
		}
		
		int parent = list.get(idx)[0];
		queue.add(parent);
		list.remove(idx);
		int cnt = 0;
		
	      while(!queue.isEmpty()){
	        int temp=queue.remove();           
	        for(int i=0;i<list.size();i++){
	            int[] arr= list.get(i);
	            boolean flag=true;
	            if(arr[1]==temp){
	            	queue.add(arr[0]);
	                list.remove(arr);
	                flag=false;
	            }
	            if(arr[0]==temp){
	            	queue.add(arr[1]);     
	                list.remove(arr);  
	                flag=false;
	            }   
	           if(flag==false){
	               i--;
	           }
	        }
	        cnt++;
	      }
	      return cnt;
    }
	
}
