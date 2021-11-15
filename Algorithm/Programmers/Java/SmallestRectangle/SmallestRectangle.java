
public class SmallestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		System.out.print(solution(size));
	}
	
	public static int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < sizes.length; i++) {
        	max = Math.max(sizes[i][0], sizes[i][1]);
        	min = Math.min(sizes[i][0], sizes[i][1]);
        	sizes[i][0] = max;
        	sizes[i][1] = min;
		}
        
        int vmax = Integer.MIN_VALUE;
        int hmax = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
        	vmax = Math.max(sizes[i][0], vmax);
        	hmax = Math.max(sizes[i][1], hmax);
		}
        
        return vmax * hmax;
    }

}
