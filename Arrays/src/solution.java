public class solution {
    public static void findArrayIntersection(int[] arr1, int n, int[] arr2, int m){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    arr2[j] = Integer.MIN_VALUE;
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr1={1,2,2,2,3,4};
        int n=arr1.length;
//        int [][]arr3=new arr3[2][3];
        int []arr2={2,2,3,3};
        int m=arr2.length;
        findArrayIntersection(arr1,n,arr2,m);
    }
}