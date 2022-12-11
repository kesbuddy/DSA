import java.util.Scanner;

public class row_wise_sum {

    public static void RowSum(int [][] arr2){
        for(int i=0;i<arr2.length;i++){
            int sum=0;
            for(int j=0;j<arr2[0].length;j++){
                sum+=arr2[i][j];
            }
            System.out.print(sum+" ");
        }
    }

    public static int[][] takeinput(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows = s.nextInt();
        System.out.println("enter no of columns");
        int cols = s.nextInt();
        int arr2[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter no at "+i+"th row and "+j+"th column");
                arr2[i][j]=s.nextInt();
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        int arr[][]=takeinput();
        RowSum(arr);
    }
}
