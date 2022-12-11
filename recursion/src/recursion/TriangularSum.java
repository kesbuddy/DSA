package recursion;

public class TriangularSum {
	
	public static String triSum(int arr[] , int n) {
		if(n==2) {
			return String.valueOf(arr[0])+String.valueOf(arr[1]);
		}
		for(int i = 0 ; i<n-1 ; i++) {
			arr[i] = (arr[i]+arr[i+1])%10;
		}
		return triSum(arr,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2};
		System.out.println(triSum(arr, arr.length));

	}

}
