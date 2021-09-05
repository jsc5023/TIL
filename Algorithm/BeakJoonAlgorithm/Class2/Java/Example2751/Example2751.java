import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Example2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			numList.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(numList); // 오름차순 정렬, Timesort 정렬(삽입정렬 + 반북정렬 => O(nlogn) 시간복잡도
		
		StringBuffer sb = new StringBuffer();
		
		for (Integer integer : numList) {
			sb.append(integer).append("\n"); // string buffer 줄바꿈
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
