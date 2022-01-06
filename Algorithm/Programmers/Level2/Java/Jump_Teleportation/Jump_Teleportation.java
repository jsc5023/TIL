
public class Jump_Teleportation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.print(solution(n));
	}

	public static int solution(int n) {
		int ans = 0;
        
		// 로직이해
		// 거리가 짝수면 -> 순간이동만으로 이동가능 그거리 이상 이동가능
		// 따라서 나누어준다.
		while(n > 0) {
			if(n % 2 == 0) {
				n /= 2;
			}
			else {
				n--;
				ans++;
			}
		}

        return ans;
    }
}
