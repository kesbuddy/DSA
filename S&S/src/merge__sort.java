public class merge__sort {
    public static int [] Merge(int []arr1, int []arr2){
        int i=0;    // i refers to the indexes of the first array
        int j=0;    // j refers to the indexes of the second array
        int k=0;    // k refers to the indexes of the merged array
        int arr3[]=new int [arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if(arr2[j]<arr1[i]){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
            else{
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        // for say arr1 was of 5 length nd arr2 was of 3 length 
        // now for remaining part of the larger array..that the remaining elements are  going to be copied to the new array directly
        // now 4,5th element of arr1 will get copied to arr3
        while(i<arr1.length){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int []arr1={2,6,9,15};
        int []arr2={1,4,6,7,7,7};
        int arr3[]= Merge(arr1,arr2);
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
