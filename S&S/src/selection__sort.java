public class selection__sort {

    public static void SelSort(int []input) {
        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            int min = input[i];
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                }
            }
            input[minIndex] = input[i];
            input[i] = min;
        }
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []arr={7,2,9,6,1,5,4};
        SelSort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}
