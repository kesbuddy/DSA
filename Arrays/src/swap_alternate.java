import java.util.Scanner;

public class swap_alternate{
    public static int[]swap(int[]input){
        int size=input.length;
        if(size%2==0){
            for(int i=0;i<size;i+=2){
                int temp=input[i];
                input[i]=input[i+1];
                input[i+1]=temp;
            }
            return input;
        }
        else{
            for(int i=0;i<size-1;i+=2){
                int temp=input[i];
                input[i]=input[i+1];
                input[i+1]=temp;
            }
            return input;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        arr= swap(arr);
        for(int i : arr)
            System.out.print(i);
    }
}
