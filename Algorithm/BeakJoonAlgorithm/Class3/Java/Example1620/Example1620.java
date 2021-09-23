import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Example1620 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> hm = new HashMap<String, String>();
		StringBuilder sb = new StringBuilder();
		String s = "";
		for (int i = 1; i <= N ; i++) {
			s = br.readLine();
			hm.put(Integer.toString(i), s);
			hm.put(s, Integer.toString(i));
		}
		
		for (int i = 0; i < M; i++) {
			
			sb.append(hm.get(br.readLine())).append("\n");
		}
		
		System.out.print(sb.toString());
	}

}
