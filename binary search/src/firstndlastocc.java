import java.util.*;

public class firstndlastocc {
	  public static int firstOcc(ArrayList<Integer> arr, int n, int k){
        int start=0;
        int ans = 0;
        int end=n-1;
        while(start<=end){  // start index is always less than or equal to end,if start becomes greater,than basically the elements have crossed over and not found
            int mid=(start+end)/2;
            if(k==arr.get(mid)){
                ans = mid;
                end = mid-1;
            }
            else if(k>arr.get(mid)){
                start=mid+1;
            }
            else if(k<arr.get(mid)){
                end=mid-1;
            }
        }
        return ans;
    }
    
    public static int lastOcc(ArrayList<Integer> arr, int n, int k){
        int start=0;
        int ans = 0;
        int end=n-1;
        while(start<=end){  // start index is always less than or equal to end,if start becomes greater,than basically the elements have crossed over and not found
            int mid=(start+end)/2;
            if(k==arr.get(mid)){
                ans = mid;
                start = mid+1;
            }
            else if(k> arr.get(mid)){
                start=mid+1;
            }
            else if(k< arr.get(mid)){
                end=mid-1;
            }
        }
        return ans;
    }
    
//    public static Pair <Integer, Integer> firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
//    	Pair<Integer, Integer> p = new Pair<>( ,);
//        p.first = firstOcc(arr,n,k);
//        p.second = lastOcc(arr,n,k);
//        return p;
//    }
};
