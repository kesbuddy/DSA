import java.util.Scanner;

public class rotate_array {
    public static void rotateArray(int[] input){
        int temp=0;
        Scanner s= new Scanner(System.in);
        int x = s.nextInt();
        int k=0;
        int crr[] = new int[8];
        for(int i=0;i<input.length;i++){
            temp=i;
            if(input[i]==x){
                for(int j=i+1;j<input.length;j++){
                    crr[k]=input[j];
                    System.out.print(crr[k]+ " ");
                    k++;
                }
                break;
            }
        }
        for(int r=0;r<=temp;r++){
            System.out.print(input[r]+ " ");
    }
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
        int [] arr= takeinput();
        rotateArray(arr);
    }
}
