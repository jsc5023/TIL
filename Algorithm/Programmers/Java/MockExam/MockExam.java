import java.util.ArrayList;

public class MockExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = {1,2,3,4,5};
		int[] de = solution(answer);
		System.out.print(1);
	}

	public static int[] solution(int[] answers) {
        
		ArrayList<Integer> list = new ArrayList<Integer>();
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] index = {0, 0, 0};
        int[] cnt = {0, 0, 0,};
        
        for (int i = 0; i < answers.length; i++) {
        	
        	if(answers[i] == student1[index[0]]) {
    			cnt[0]++;
    		}
    		index[0]++;
    		
    		if(answers[i] == student2[index[1]]) {
    			cnt[1]++;
    		}
    		index[1]++;
    		
    		if(answers[i] == student3[index[2]]) {
    			cnt[2]++;
    		}
    		index[2]++;
        	
        	if(index[0] >= student1.length) {
        		index[0] = 0;
        	}
        	if(index[1] >= student2.length) {
        		index[1] = 0;
        	}
        	if(index[2] >= student3.length) {
        		index[2] = 0;
        	}
		}
        int max = Math.max(cnt[0], cnt[1]);
        max = Math.max(max, cnt[2]);
        
        for (int i = 0; i < cnt.length; i++) {
			if(cnt[i] == max) {
				list.add(i + 1);
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i=0; i < answer.length; i++)
        {
        	answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}
