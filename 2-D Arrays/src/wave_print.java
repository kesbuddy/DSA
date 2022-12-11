import java.util.Scanner;

public class wave_print {

   public static void Wave(int [][]arr2){
       int k=0;
       for(int j=0;j<= arr2[0].length;j=j+2){
           for(int i=0;i< arr2.length;i++){
               System.out.print(arr2[i][j]+" ");
               k=i;
           }
           for(int x=k;k>=0;k--){
               System.out.print(arr2[k][j+1]+" ");
           }
       }
   }

    public static int[][] takeinput(){
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int cols = s.nextInt();
        int arr2[][] = new int[row][cols];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=s.nextInt();
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr[][]=takeinput();
        Wave(arr);
    }

}
