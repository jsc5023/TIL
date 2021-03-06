package HashMaps;

import java.util.*;

class ClassHashMaps {
	public static void main(String args[]) {
		String[] s = {"Hello", "Hello", "Hi", "New"};
		
		countStrings(s);
	}
	
	static void countStrings(String[] s) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < s.length; i++) {
			if(!hm.containsKey(s[i])) {
				hm.put(s[i], 0);
			}
			hm.put(s[i], hm.get(s[i]) + 1);
		}
		
		for (String key : hm.keySet()) {
			System.out.println(key + " " + hm.get(key));
			
		}
	}
}