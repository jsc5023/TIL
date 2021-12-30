import java.util.ArrayList;

public class IntersectionStars {

	static ArrayList<int[]> list;
	static int max_x = Integer.MIN_VALUE;
	static int min_x = Integer.MAX_VALUE;
	static int max_y = Integer.MIN_VALUE;
	static int min_y = Integer.MAX_VALUE;
	
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
        
        boolean[][] answerTemp = new boolean[(int) (max_y- min_y +1)][(int) (max_x - min_x + 1)];

        for (int[] ints : list) {
            int x = (int) (ints[0] - min_x);
            int y = (int) (ints[1] - max_y);

            answerTemp[Math.abs(y)][Math.abs(x)] = true;
        }

        answer = new String[answerTemp.length];

        int i = 0;
        for (boolean[] bs : answerTemp) {
            StringBuilder sb = new StringBuilder();
            for (boolean b : bs) {
                if(b){
                    sb.append("*");
                }else{
                    sb.append(".");
                }
            }
            answer[i] = sb.toString();
            i++;
        }
        
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
			max_x = Math.max(max_x, (int)ans_x);
			min_x = Math.min(min_x, (int)ans_x);
			max_y = Math.max(max_y, (int)ans_x);
			min_y = Math.min(min_y, (int)ans_x);
			
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
