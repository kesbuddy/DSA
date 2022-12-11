//LEETCODE  - -  MEDIUM
// Given an array, rotate the array to the right by k steps, where k is non-negative


public class rotate_by_k {
		  public static int[] rotate(int[] nums, int k) {
		        int nums2[]= new int[nums.length];
		        int n = nums.length;
		        for(int i=0;i<nums.length;i++){
		            nums2[(i+k)%n] = nums[i];
		        }
		        nums=nums2;
		        return nums;
//		        for(int e:nums) {
//		        	System.out.print(e+" ");
//		    }
//}
		  }

	public static void main(String[] args) {
		int arr[]  = {1,2,3,4,5,6,7};
		int arr2[] = rotate(arr,3);
		 for(int e:arr2) {
	        	System.out.print(e+" ");
	    }
	
}
		
        
		
}
