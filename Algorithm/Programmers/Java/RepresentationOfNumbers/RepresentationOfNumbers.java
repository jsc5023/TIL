
public class RepresentationOfNumbers {

	public static void main(String[] args) {
		int n = 15;
		System.out.print(solution(n));
	}
	
	public static int solution(int n) {
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
        	cnt += recursion(i, n);
		}
        
        return cnt;
    }

	public static int recursion(int startNum, int n) {
        int sum = 0;
        for (int i = startNum; i <= n; i++) {
			sum += i;
			if(sum == n) {
				return 1;
			}
			if(sum > n) {
				return 0;
			}
		}
        return 0;
    }

}
