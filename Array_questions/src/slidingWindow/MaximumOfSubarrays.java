package slidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class MaximumOfSubarrays {
	
	public static int maximum(List<Integer> list , int k) {
		
		int i = 0;
		int j = 0;
		int sum = 0;
		int size = list.size();
		int max = Integer.MIN_VALUE;
		HashSet<Integer> set = new HashSet<>();
		while(j<size) {
			sum+=list.get(j);
			if(j-i+1 < k ) {
				j++;
			}
			else if(j-i+1 == k) {
				
				max = Math.max(max, sum);
				sum-=list.get(i);
				i++;
				j++;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(8);
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(6);
		System.out.println(maximum(list, 3));	

	}

}
