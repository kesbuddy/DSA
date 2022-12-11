
public class rotate_array {
	
	public static int[] rotate(int []arr) {
		int i = 0;
		int temp = 0;
		int j = arr.length-1;
		while(i<j) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
		return arr;
	}
	

	public static void main(String[] args) {
		int arr[] = {1,2,7,8,5};
		rotate(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}
		

	}

}
