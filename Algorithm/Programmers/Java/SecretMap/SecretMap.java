public class SecretMap {

	public static void main(String[] args) {
		
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		solution(n, arr1, arr2);
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr1String = new String[n];
        for (int i = 0; i < n; i++) {
        	arr1String[i] = Integer.toBinaryString(arr1[i]);
        	
        	 while(n > arr1String[i].length()) {
        		 arr1String[i] = "0" + arr1String[i];
        	 }
		}
        
        String[] arr2String = new String[n];
        
        for (int i = 0; i < n; i++) {
        	arr2String[i] = Integer.toBinaryString(arr2[i]);
        	
        	while(n > arr2String[i].length()) {
        		arr2String[i] = "0" + arr2String[i];
       	 	}
		}
        
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
        	answer[i] = "";
        	
        	char[] arr1chars = arr1String[i].toCharArray();
        	char[] arr2chars = arr2String[i].toCharArray();
        	
        	for (int j = 0; j < n; j++) {
				if(arr1chars[j] == '1' || arr2chars[j] == '1')
					answer[i] += "#";
				else
					answer[i] += " ";
			}
		}
        return answer;
    }
}
