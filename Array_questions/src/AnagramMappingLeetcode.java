import java.util.*;

public class AnagramMappingLeetcode {
	
	public static int[] anagram(int []arr1,int []arr2) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<arr2.length;i++) {
			map.put(arr2[i], i);
		}
		for(int j = 0;j<arr1.length;j++) {
			map.put(arr1[j], map.get(arr1[j]));
		}
		
		for(int i = 0;i<arr1.length;i++) {
			arr1[i] = map.get(arr1[i]);
		}
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 30;
		System.out.println(String.valueOf(1));
	
	}

}
