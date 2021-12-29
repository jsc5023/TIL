import java.util.ArrayList;

public class IntersectionStars {

	static ArrayList<int[]> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
		
		solution(line);
	}
	
	public static String[] solution(int[][] line) {
        String[] answer = {};
        
        list = new ArrayList<>();
        
        for (int i = 0; i < line.length; i++) {
        	for (int j = i+1; j < line.length; j++) {
        		IntersectionPoint(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
			}
        	
		}
        
        // 이제 어떻게 ...을 만들것인지 고민
        String[] str = new String[];
        return answer;
    }
	
	public static void IntersectionPoint(int a, int b, int e, int c, int d, int f) {
		
		double deno = a*d - b*c;
		
		double numerator_x = b*f - e*d;
		double numerator_y = e*c - a*f;
		
		double ans_x = numerator_x / deno;
		double ans_y = numerator_y / deno;
		
		boolean check_x = doubleIntCheck(ans_x);
		boolean check_y = doubleIntCheck(ans_y);
		
		if(check_x && check_y) {
			int[] arr = {(int)ans_x, (int)ans_y};
			list.add(arr);
		}
			
	}
	
	public static boolean doubleIntCheck(double number) {
		
		boolean check = false;
		if(Math.ceil(number) == Math.floor(number))
			check = true;
		
		return check;
	}

}
