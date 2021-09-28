import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Example9375 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			
			int n = Integer.parseInt(br.readLine());
			
			Map<String, Integer> wear = new HashMap<>();
			
			for (int i = 0; i < n; i++) {
				
				String[] s = br.readLine().split(" ");
				
				if(wear.containsKey(s[1]))
					wear.put(s[1], wear.get(s[1]) + 1);
				else
					wear.put(s[1], 1);
			}
			
			int cnt = 1;
			
			for (int item : wear.values()) {
				
				cnt *= item + 1;
			}
			
			sb.append(cnt - 1).append("\n");
		}
		
		System.out.print(sb.toString());
	}

}
