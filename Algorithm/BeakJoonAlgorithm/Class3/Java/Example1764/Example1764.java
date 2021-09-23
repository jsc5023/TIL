import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Example1764 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> hs = new HashSet<String>();
		
		for (int i = 0; i < N; i++) {
			hs.add(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			
			String inputS = br.readLine();
			if(hs.contains(inputS))
				arr.add(inputS);
		}
		
		arr.sort(Comparator.naturalOrder()); // nutralOrder -> 오름차순 정렬
		
		sb.append(arr.size()).append("\n");
		
		for (int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i)).append("\n");
		}
		
		System.out.print(sb.toString());
	}

}
