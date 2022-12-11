import java.util.*;
import java.util.HashMap;
public class replaceCharacter {
	
	public static String replace(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		char ans[] = new char[str.length()];
		for(int i = 0 ; i<str.length();i++) {
			ans[i] = (char)((int)str.charAt(i)+2);
		}
		String str1 = String.valueOf(ans);
		return str1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c = 'a';
		System.out.println(replace("himanshu"));
		
		
		

	}

}
