import java.util.Arrays;

public class Lifeboat {

	public static void main(String[] args) {

		int[] people = {70, 50, 80, 50};
		int limit = 100;
		System.out.print(solution(people, limit));
	}
	
	 public static int solution(int[] people, int limit) {
        int answer = 1;
        
        Arrays.sort(people);
        
        int min = 0;
        
        for (int max = people.length - 1; min <= max; max--){
          if (people[min] + people[max] <= limit)
        	  min++;
          answer++;
        }

        return answer;
    }

}
