import java.util.Scanner;

public class print_unique_number {
    public static void uniqueValue(int [] input){
        for(int i=0;i<input.length;i++){
            int temp=input[i];
            for(int j=i+1;j< input.length;j++){
                if(temp==input[j]){
                    System.out.print(temp + " ");
                }
            }
            }
        }

    public static int[] takeinput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for(int i=0;i<size;i++){
            if(input[i]<=(size-2)){
                input[i]=s.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int [] arr = takeinput();
        uniqueValue(arr);
    }
}
