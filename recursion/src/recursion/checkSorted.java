package recursion;

public class checkSorted {
//	// approach 1 
//	public static boolean checkSorted_2(int arr[]) {
//		if(arr.length==1) {
//			return true;
//		}
//		if(arr[0]>arr[1]) {
//			return false;
//		}
//		int smallArr[] = new int[arr.length-1];
//		for(int i=1;i<arr.length;i++) {
//			smallArr[i-1]=arr[i];
//		}
//		boolean smallAns = checkSorted_2(smallArr);
//		return smallAns;
	
	//approach 2 
	public static boolean checkSortedBetter(int arr[],int smallIndex) {
		if(smallIndex==arr.length-1) {
			return true;
		}
		if(arr[smallIndex]>arr[smallIndex+1]) {
			return false;
		}
		boolean smallAns = checkSortedBetter(arr, smallIndex+1);
		return smallAns;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {4,2,4,6,7};
		System.out.println(checkSortedBetter(arr,0));

}
}
