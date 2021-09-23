import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Example17219 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> hm = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			hm.put(st.nextToken(), st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			
			if(hm.containsKey(s))
				sb.append(hm.get(s)).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
