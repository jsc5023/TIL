
public class Length_Of_Visit {

	public static int[] dx = {0, 0, 1, -1};
	public static int[] dy = {1, -1, 0, 0}; // 상하우좌 (설명이 UDRL 순으로 나와있어서 따릅니다.)
	public static boolean[][][][] visit = new boolean[11][11][11][11];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirs = "LULLLLLLU";
		System.out.print(solution(dirs));
		
	}

	public static int solution(String dirs) {
        int answer = 0;
        
        int x = 0;
        int y = 0;
        
        int next_x = 5; // 시작위치(정중앙)
        int next_y = 5; // 시작위치(정중앙)
        
        int idx = 0;
        
        for (int i = 0; i < dirs.length(); i++) {
			
        	x = next_x; // 현재위치 저장
        	y = next_y;
        	
        	if(dirs.charAt(i) == 'U')
        		idx = 0;
        	else if(dirs.charAt(i) == 'D')
        		idx = 1;
        	else if(dirs.charAt(i) == 'R')
        		idx = 2;
        	else if(dirs.charAt(i) == 'L')
        		idx = 3;
        	
        	
        	// U, D, R, L에 맞는 캐릭터 위치 이동
        
        	next_x += dx[idx];
        	next_y += dy[idx];
        	
        	if(next_x < 0 || next_y < 0 || next_x > 10 || next_y > 10) {
        		next_x -= dx[idx];
            	next_y -= dy[idx];
            	continue;
        	}
        		
            if(!visit[x][y][next_x][next_y] && !visit[next_x][next_y][x][y]){
                visit[x][y][next_x][next_y] = true;
                visit[next_x][next_y][x][y] = true;
                answer ++;
            }

		}
        
        return answer;
    }
	
}
