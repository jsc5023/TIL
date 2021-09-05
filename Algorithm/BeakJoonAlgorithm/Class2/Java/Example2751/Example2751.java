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
		
		Collections.sort(numList); // �������� ����, Timesort ����(�������� + �ݺ����� => O(nlogn) �ð����⵵
		
		StringBuffer sb = new StringBuffer();
		
		for (Integer integer : numList) {
			sb.append(integer).append("\n"); // string buffer �ٹٲ�
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
