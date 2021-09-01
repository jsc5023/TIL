import java.util.Scanner;

public class Example1018 {
	
	final static int W = 0;
	final static int B = 1;
	
	final static int[][] BoardW = {
		{W,B,W,B,W,B,W,B},
		{B,W,B,W,B,W,B,W},
		{W,B,W,B,W,B,W,B},
		{B,W,B,W,B,W,B,W},
		{W,B,W,B,W,B,W,B},
		{B,W,B,W,B,W,B,W},
		{W,B,W,B,W,B,W,B},
		{B,W,B,W,B,W,B,W}
	};
	
	final static int[][] BoardB = {
			{B,W,B,W,B,W,B,W},
			{W,B,W,B,W,B,W,B},
			{B,W,B,W,B,W,B,W},
			{W,B,W,B,W,B,W,B},
			{B,W,B,W,B,W,B,W},
			{W,B,W,B,W,B,W,B},
			{B,W,B,W,B,W,B,W},
			{W,B,W,B,W,B,W,B}
		};
	
	static int[][] Board;
	
	static int result = 64;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Board = new int[N+1][M+1];
		
		sc.nextLine(); // 개행제거용
		for (int i = 0; i < N; i++) {
			String st = sc.nextLine();
			
			for(int j=0;j<M;j++){
				if(st.charAt(j) == 'W')
					Board[i][j] = 0;
				else
					Board[i][j] = 1;
			}
		}
		
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M-8; j++) {
				boardCalc(i,j);
			}
		}
		
		System.out.println(result);
	}
	
	public static void boardCalc(int a, int b) {
		
		int temp1 = 0, temp2 = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(Board[i + a][j + b] != BoardW[i][j]) temp1++;
				if(Board[i + a][j + b] != BoardB[i][j]) temp2++; 
			}
		}
		
		
		result = Math.min(result, temp1);
		result = Math.min(result, temp2);
		
		
	}

}
