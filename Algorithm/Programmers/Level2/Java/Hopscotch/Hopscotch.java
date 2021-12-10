import java.util.Arrays;

public class Hopscotch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.print(solution(land));
	}
	
	public static int solution(int[][] land) {
        // 풀이방법 -> land에서 0, 1, 2, 3의 열마다 가질 수 있는 최대값을 구한다.
        // 그후 Array.Sort를 통해 정렬후, 전체의 최대값을 가져옵니다.
        for (int i = 1; i < land.length; i++) {
			land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
			land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
			land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
			land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
		}
        
        int[] result = land[land.length - 1]; // land의 가장 마지막 값을 가져옵니다.
        Arrays.sort(result);
        return result[3]; // 3이 최대값이므로(열은 총 4개 고정)
    }

}
