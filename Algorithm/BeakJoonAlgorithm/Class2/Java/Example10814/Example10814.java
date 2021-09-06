import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Example10814 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		Human[] humans = new Human[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			humans[i] = new Human(age, name);
		}
		
		br.close();
		
		Arrays.sort(humans, new Comparator<Human>() {
			@Override
			public int compare(Human h1, Human h2) {
				return h1.age - h2.age;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			sb.append(humans[i].age).append(" ").append(humans[i].name).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
	
	public static class Human{
		
		int age;
		String name;
		
		public Human(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}

}
