import java.util.ArrayList;

public class Inverted_permutations {

	public static ArrayList<Integer> inversePermutation (int arr[], int n) {
        ArrayList<Integer> l1 = new ArrayList<>(n);
        for(int i = 0; i<=n; i++){
            int value = arr[i];
            l1.set(value,i+1);
        }
        return l1;
    }
	public static void main(String[] args) {
		int arr[] = {1,4,3,2};
		ArrayList<Integer> l1 = inversePermutation(arr, arr.length);
		for(int elem: l1) {
			System.out.println(elem);
		}

	}

}
