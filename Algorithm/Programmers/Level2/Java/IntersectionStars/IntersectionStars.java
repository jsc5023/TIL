import java.util.HashSet;
import java.util.Set;

public class IntersectionStars {

	static int max_x = Integer.MIN_VALUE;
	static int min_x = Integer.MAX_VALUE;
	static int max_y = Integer.MIN_VALUE;
	static int min_y = Integer.MAX_VALUE;
	static Set<String> hs = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
		int[][] line = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
		
		solution(line);
	}
	
	public static String[] solution(int[][] line) {
        for (int i = 0; i < line.length - 1; i++) {
        	for (int j = i+1; j < line.length; j++) {
        		IntersectionPoint(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
			}
        	
		}
        
        String[] answer = new String[max_y - min_y + 1];
        for(int i=max_y ; i>=min_y ; i--) {
            StringBuilder sb = new StringBuilder();
            for(int j=min_x ; j<=max_x ; j++) {
                sb.append(hs.contains(i+"|"+j)?"*":".");
            }
            answer[max_y-i] = sb.toString();
        }
        return answer;
    }
	
	public static void IntersectionPoint(int a, int b, int e, int c, int d, int f) {
		
		long x1=(long)a, y1=(long)b, z1=(long)e;
        long x2=(long)c, y2=(long)d, z2=(long)f;
        if(x1*y2==y1*x2 || (y1*z2-y2*z1)%(x1*y2-y1*x2)!=0 || (x2*z1-x1*z2)%(x1*y2-y1*x2)!=0) {
            return;
        }
        int x = (int)(y1*z2-y2*z1)/(int)(x1*y2-y1*x2);
        int y = (int)(x2*z1-x1*z2)/(int)(x1*y2-y1*x2);
        hs.add(y+"|"+x);
        max_y = Math.max(max_y, y);
        min_y = Math.min(min_y, y);
        max_x = Math.max(max_x, x);
        min_x = Math.min(min_x, x);

	}

}
