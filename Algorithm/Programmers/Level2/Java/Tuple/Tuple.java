import java.util.ArrayList;
import java.util.Arrays;

public class Tuple {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		solution(s);
		
	}
	
	public static int[] solution(String s) {
		ArrayList<Integer> list = new ArrayList<>();
		
		s = s.substring(2, s.length());
		s = s.substring(0, s.length() - 2).replace("},{", ":");
		
		String str[] = s.split(":"); 
		
		Arrays.sort(str, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        
		for (String string : str) {
			String[] temp = string.split(",");
            for(int i = 0 ; i < temp.length;i++){
                int n = Integer.parseInt(temp[i]);
                if(!list.contains(n))
                	list.add(n);
            }
		}
		
		Integer[] arr = new Integer[list.size()];
		arr = list.toArray(arr);
		
		int[] answer = Arrays.stream(arr).mapToInt(i -> i).toArray();
		
        return answer;
    }
}
