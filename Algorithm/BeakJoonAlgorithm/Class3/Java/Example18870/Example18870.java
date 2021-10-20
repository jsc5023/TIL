import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Example18870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(st.nextToken());

        int[] sortNums = nums.clone();
        Arrays.sort(sortNums);

        Map<Integer, Integer> dic = new HashMap<>();
        
        int idx = 0;
        for (int item : sortNums) {
			if(!dic.containsKey(item))
				dic.put(item, idx++);
		}
            
        StringBuilder sb = new StringBuilder();
        for (int item : nums) {
			sb.append(dic.get(item)).append(" ");
		}

        System.out.print(sb.toString());
	}

}
