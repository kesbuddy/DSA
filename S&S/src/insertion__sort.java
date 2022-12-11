public class insertion__sort {
    public static void InsertionSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int j = i - 1;
            int temp = 0;
            while (j >= 0 && input[j] > input[i]) {
                temp = input[j];
                input[j] = input[i];
                j--;
            }
            input[i + 1] = temp;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int []arr={8,2,6,1,9};
        // InsertionSort(arr);
        String s = "1234";
        System.out.println(Integer.valueOf(s));
    }
}
