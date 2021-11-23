
public class RecommendNewId {

	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		System.out.print(solution(new_id));
	}
	
	public static String solution(String new_id) {
        String str = "";
        
        String[] condition = new String[2];
        str = new_id.toLowerCase();
        
        char[] newchar = str.toCharArray();
        
        condition[0] = "";
        for (int i = 0; i < newchar.length; i++) {
			if((newchar[i] >= 'a' && newchar[i] <= 'z') || (newchar[i] == '-') || (newchar[i] == '_') || (newchar[i] == '.') || (newchar[i] >= '0' && newchar[i] <= '9')) {
				condition[0] += newchar[i];
			}
		}
        
        while(condition[0].indexOf("..") > -1) {
        	condition[0] = condition[0].replace("..", ".");
        }
        condition[1] = condition[0];
        
        if(condition[1].charAt(0) == '.') {
        	condition[1] = condition[1].substring(1);
        }
        
        if(condition[1].length() >= 1) {
        	if(condition[1].charAt(condition[1].length() - 1) == '.') {
            	condition[1] = condition[1].substring(0, condition[1].length() - 1);
            }
        }
        
        if(condition[1].isEmpty()) {
        	condition[1] = "a";
        }
        
        if(condition[1].length() >= 16) {
        	condition[1] = condition[1].substring(0, 15);
        }
        
        if(condition[1].length() >= 1) {
        	if(condition[1].charAt(condition[1].length() - 1) == '.') {
            	condition[1] = condition[1].substring(0, condition[1].length() - 1);
            }
        }
        
        
        if(condition[1].length() <= 2) {
        	while(condition[1].length() < 3) {
        		try {
        			char a = condition[1].charAt(condition[1].length() - 1);
            		condition[1] += a;
				}
        		catch (Exception e) {
        			break;
        		}
        	}
        }
        
        return condition[1];
    }

}
