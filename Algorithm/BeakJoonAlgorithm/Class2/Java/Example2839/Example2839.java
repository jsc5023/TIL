import java.util.Scanner;
public class Example2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// 핵심은 5로 우선 나눈 나머지를 찾는다.(5값이 가장크기 떄문에) 나누어 떨어지면 그값이 답이므로 사용하면된다.
		// 5로 나눈 나머지가 0이아닌경우, 3을 빼서 다시 반복한다. (3배수 일 경우를 찾는것이다.)
		// 그리고 5,3 의 최소공배수는 15, 3*5일때 최소 공배수, 즉 5번을 반복한다면, 첫번째 한 행위랑 같아지가때문에, 5번 뺀 이후는 생각할 필요가 없다.
		int cnt = 0;
		while(cnt < 5) {
			
			if(n % 5 == 0 & n >= 0) { // 음수의 갯수는 존재하지 않기때문(이값이 빠지면, -값이 되어 반드시 나머지가 0이 나오기때문)
				System.out.print(n / 5 + cnt);
				return;
			}
			n -= 3;
			cnt++;
		}
		
		System.out.print(-1);
	}

}
