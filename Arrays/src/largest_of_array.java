import java.util.Scanner;

public class largest_of_array {
    public static int largestofArray(int input[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        return max;
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
    public static void print(int input[]){
        int size = input.length;
        for(int i=0;i<size;i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        print(arr);
        System.out.println("the largest number is " + largestofArray(arr));
    }


}
