import java.util.Arrays;
public class Pair_sum {
	
	public static int[][] pairS(int []arr, int s){
		
		int [][] arr2 = new int[s][2];
		int k = 0;
		int m = 0;
		for(int i = 0; i<arr.length-1;i++) {
			int temp = arr[i];
			for(int j = i+1;j<arr.length;j++) {
				m = 0;
				if(temp+arr[j] == s) {
					arr2[k][m] = Math.min(temp, arr[j]);
					m++;
					arr2[k][m] = Math.max(temp, arr[j]);
					k++;
				}
			}
		}
		return arr2;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int arr2[][] = pairS(arr, 5);
		for(int i = 0;i<arr2.length;i++) {
			for(int j = 0; j<arr2[i].length;j++) {
				System.out.print(arr2[i][j] +" ");
			}
		}

	}

}
