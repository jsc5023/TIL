import java.util.Arrays;

public class Hopscotch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.print(solution(land));
	}
	
	public static int solution(int[][] land) {
        // Ǯ�̹�� -> land���� 0, 1, 2, 3�� ������ ���� �� �ִ� �ִ밪�� ���Ѵ�.
        // ���� Array.Sort�� ���� ������, ��ü�� �ִ밪�� �����ɴϴ�.
        for (int i = 1; i < land.length; i++) {
			land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
			land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
			land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
			land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
		}
        
        int[] result = land[land.length - 1]; // land�� ���� ������ ���� �����ɴϴ�.
        Arrays.sort(result);
        return result[3]; // 3�� �ִ밪�̹Ƿ�(���� �� 4�� ����)
    }

}
