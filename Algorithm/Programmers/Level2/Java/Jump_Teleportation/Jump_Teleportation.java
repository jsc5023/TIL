
public class Jump_Teleportation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.print(solution(n));
	}

	public static int solution(int n) {
		int ans = 0;
        
		// ��������
		// �Ÿ��� ¦���� -> �����̵������� �̵����� �װŸ� �̻� �̵�����
		// ���� �������ش�.
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
