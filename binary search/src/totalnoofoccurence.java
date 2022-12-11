
import java.util.Scanner;

public class totalnoofoccurence {

		public static int firstOcc(int []arr, int n, int k){
	        int start=0;
	        int ans1 = 0;
	        int end= (n-1);
	        while(start<=end){  // start index is always less than or equal to end,if start becomes greater,than basically the elements have crossed over and not found
	            int mid=(start+end)/2;
	            if(k==arr[mid]){
	                ans1 = mid;
	                end = mid-1;
	            }
	            else if(k>arr[mid]){
	                start=mid+1;
	            }
	            else if(k<arr[mid]){
	                end=mid-1;
	            }
	        }
	        return ans1;
	    }
	    
	    public static int lastOcc(int [] arr, int n, int k){
	        int start=0;
	        int ans2 = 0;
	        int end= n-1;
	        while(start<=end){  // start index is always less than or equal to end,if start becomes greater,than basically the elements have crossed over and not found
	            int mid=(start+end)/2;
	            if(k==arr[mid]){
	                ans2 = mid;
	                start = mid+1;
	            }
	            else if(k> arr[mid]){
	                start=mid+1;
	            }
	            else if(k< arr[mid]){
	                end=mid-1;
	            }
	        }
	        return ans2;
	    

	}
      public static void main(String[] args) {
    	  int arr [] = {1,2,3,3,3,5};
    	  int n = arr.length;
    	  Scanner sc = new Scanner(System.in);
    	  int k = sc.nextInt();
    	  int f = firstOcc(arr,n,k);
    	  int l = lastOcc(arr,n,k);
    	  int count = (l-f)+1;
    	  System.out.println("no of occurences of "+k+" is "+count); 
    	  
      }
    	  

}
