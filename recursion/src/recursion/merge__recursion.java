package recursion;

public class merge__recursion {
	public static void mergeSort(int input[],int sI,int eI) {
		if(sI>=eI) {
			return;
		}
		int mid = (sI+eI)/2;
		mergeSort(input,sI,mid);
		mergeSort(input,mid+1, eI);
		merge(input,sI,eI);
	}
	
	 public static void merge(int input[],int sI,int eI){
	        int mid = (sI+eI)/2;   
		    int i=sI;    // i refers to the indexes of the first array
	        int j=mid+1;    // j refers to the indexes of the second array
	        int k=0;    // k refers to the indexes of the merged array
	        int arr3[]=new int [(sI-eI)+1];
	        while(i<=mid && j<=eI){
	            if(input[j]<input[i]){
	                arr3[k]=input[j];
	                j++;
	                k++;
	            }
	            else{
	                arr3[k]=input[i];
	                i++;
	                k++;
	            }
	        }
	        // for say arr1 was of 5 length nd arr2 was of 3 length 
	        // now for remaining part of the larger array..that the remaining elements are  going to be copied to the new array directly
	        // now 4,5th element of arr1 will get copied to arr3
	        while(i<=mid){
	            arr3[k]= input[i];
	            i++;
	            k++;
	        }
	        while(j<=eI){
	            arr3[k]= input[j];
	            k++;
	            j++;
	        }
	        // copying elements from merged array to the original array !
	        for(int index=0;i<arr3.length;index++) {
	        	input[sI+index] = arr3[index];
	        }
	    }
	
	
	public static void main(String[] args) {
		int arr[] = {8,1,4,3,9,2,7};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}

	}

}
