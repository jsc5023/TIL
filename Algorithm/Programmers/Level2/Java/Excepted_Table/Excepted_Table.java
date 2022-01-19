
public class Excepted_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16; //8
		int a = 14; //4
		int b = 15; //7
		System.out.print(solution(n, a, b));
	}

	public static int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a != b) {
        	answer++;

        	int nowA = (int)Math.ceil((double)a/2.0);
        	int nowB = (int)Math.ceil((double)b/2.0);
        	
        	a = nowA;
        	b = nowB;
        }

        return answer;
    }
}
