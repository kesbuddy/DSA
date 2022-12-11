//LEETCODE -->
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

public class move_zeroes {
	
	public static int[] moveZeroes(int []nums) {
		int n = nums.length-1;
		int k = 0;
		int i=0;
		while(i<=n) {
			if(nums[i]!=0) {
				nums[k] = nums[i];
				i++;
				k++;
			}
			else {
				i++;
			}
		}
		while(k<=n) {
			nums[k] = 0;
			k++;
		}
		return nums;
	}
	

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,3,4};
		int arr2[] = moveZeroes(arr);
		for(int elem:arr2) {
			System.out.println(elem);
		}
	}

}
