
public class QuadCompressionCount {

	static int[] answer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		solution(arr);
	}
	
	public static int[] solution(int[][] arr) {
		answer = new int[2];
		
		quad(arr.length, 0, 0, arr);
        return answer;
    }
	
	public static void quad(int n, int y, int x, int[][] arr) {
		
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
	
	public static boolean isBlock(int n, int y, int x, int[][] arr) {
		
		for (int i = y; i < y + n; i++) {
			for (int j = x; j < x + n; j++) {
				if(arr[y][x] != arr[i][j]) return false;
			}
		}
		
		answer[arr[y][x]]++;
		return true;
		
	}
	
	

}
