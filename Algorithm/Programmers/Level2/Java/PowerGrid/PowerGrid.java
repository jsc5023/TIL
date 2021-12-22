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
        int answer = -1;
        // 완전탐색으로 문제풀기
        int val1=0;
        int val2=0;
        for(int i=0;i<wires.length;i++){
            val1=relationCnt(i,wires);
            val2=n-val1;
            int total=Math.abs(val1-val2);
            answer=Math.min(total,answer);
        }
        return answer;
    }
	
	public static int relationCnt (int idx, int[][] wires){
        
        Queue<Integer> que = new LinkedList<>();
        List<int[]> list = new ArrayList<>();
        for(int[] data:wires){
            list.add(data);
        }
        
        int parent=list.get(idx)[0];
        que.add(parent);
        list.remove(idx);
        int cnt=0;
        
        while(!que.isEmpty()){
          int temp=que.remove();           
          for(int i=0;i<list.size();i++){
              int[] arr= list.get(i);
              boolean flag=true;
              if(arr[1]==temp){
                  que.add(arr[0]);
                  list.remove(arr);
                  flag=false;
              }
              if(arr[0]==temp){
                  que.add(arr[1]);     
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
