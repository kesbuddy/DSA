
public class swap_alternate {
	
	public static int[] swap(int []arr) {
		
		int temp = 0;
		for(int i = 0; i<arr.length;i=i+2) {
			if(i+1 < arr.length) {
				temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,7,8,5,6};
		swap(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}
		

	}

}
