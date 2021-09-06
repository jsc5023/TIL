import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Example11650 {
	
	public static class XY{
		int x;
		int y;
		
		public XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		XY[] xy = new XY[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			xy[i] = new XY(x, y);
		}
		
		br.close();
		Arrays.sort(xy, new Comparator<XY>(){
			@Override
			public int compare(XY a1, XY a2) {
				if(a1.x < a2.x) {
					return -1;
				}
				else if(a1.x == a2.x) {
					if(a1.y < a2.y) {
						return -1;
					}
				}
				return 1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			sb.append(xy[i].x).append(" ").append(xy[i].y).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
