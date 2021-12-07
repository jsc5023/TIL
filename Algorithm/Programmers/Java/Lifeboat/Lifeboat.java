import java.util.Arrays;

public class Lifeboat {

	public static void main(String[] args) {

		int[] people = {70, 50, 80, 50};
		int limit = 100;
		System.out.print(solution(people, limit));
	}
	
	 public static int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int min = 0;
        
        for (int max = people.length - 1; min <= max; max--){
          if (people[min] + people[max] <= limit) // 가장 큰값, 가장작은값 뺏을 경우 구하도록 변경합니다.
        	  min++;
          answer++;
        }

        return answer;
    }

}
