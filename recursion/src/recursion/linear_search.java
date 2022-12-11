package recursion;

public class linear_search {
	public static boolean lSearch(int n,int arr[]) {
		if(n==arr[arr.length-1]) {
			return true;
		}
		int lIndex = arr.length-1;
		//lSearch(n,arr[lIndex-1]);
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {3,5,1,4,8,9};
		System.out.println(lSearch(8,arr));

	}

}
