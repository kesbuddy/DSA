import java.util.Scanner;

public class second_largest {
    public static int secondLargest(int[] input) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int j = 0; j < input.length; j++) {
            if (input[j] > max) {
                max = input[j];
            }
        }
        for(int i=0;i<input.length;i++){
            if(input[i]==max){
                continue;
            }
            else{
                if(input[i]>max2){
                    max2=input[i];
                }
            }
        }
        for(int k=0;k<input.length;k++){
            if(input[k]==input[k+1]){

            }
        }
        return max2;
}

    public static int[] takeinput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for(int i=0;i<size;i++){
            input[i]=s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.println("second largest element is " + secondLargest(arr));

    }
}
