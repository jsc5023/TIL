
public class FindMostBigSquare {

	public static void main(String[] args) {
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.print(solution(board));
	}
	
	public static int solution(int [][]board)
    {
		// 답이 틀려서 인터넷꺼 재풀이 합니다.
		int answer = 0;
        int[][] newBoard = new int[board.length+1][board[0].length+1];
        // 새로운 배열 생성
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[i].length; j++)
                newBoard[i+1][j+1] = board[i][j];
        
        int max = 0;
        
        for(int i=1; i<newBoard.length; i++){
            for(int j=1; j<newBoard[i].length; j++){
                if(newBoard[i][j] == 1){
                    int left = newBoard[i-1][j];    // 좌측 값
                    int up = newBoard[i][j-1];      // 상단 값
                    int leftUp = newBoard[i-1][j-1];// 좌측상단(대각선) 값
                    int min = Math.min(left, Math.min(up, leftUp)); 
                    newBoard[i][j] = min+1;
                    max = Math.max(max, min+1);
                }
            }
        }
        answer = max * max;
        return answer;
    }
}
