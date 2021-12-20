
public class QuadCompressionCount {

	static int[] dx = {-1, 0, 0, 1};
	static int[] dy = {0, -1, 1, 0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		solution(arr);
	}
	
	public void quad(int n, int y, int x, int[][] arr) {
		
		if(n == 1) {
			answer[arr[y][x]]++;
			return;
		}
		
		if(isBlock(n, y, x, arr)) return;
		
		quad(n/2, y, x, arr);
		quad(n/2, y + n/2, x, arr);
		quad(n/2, y, x + n/2, arr);
		quad(n/2, y + n/2, x + n/2, arr);
	}
	
	public boolean isBlock(int n, int y, int x, int[][] arr) {
		
		for (int i = y; i < y + n; i++) {
			for (int j = x; j < x + n; j++) {
				if(arr[y][x] != arr[i][j]) return false;
			}
		}
		
		answer[arr[y][x]]++;
		return true;
		
	}
	
	public static int[] solution(int[][] arr) {
        int[] answer = {};
        // 풀이방법
        // 상하좌우 4단계 모두를 비교해서 풀어나가자.
        
        
        return answer;
    }

}
