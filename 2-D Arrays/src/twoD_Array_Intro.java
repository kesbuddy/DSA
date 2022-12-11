import java.util.Scanner;

public class twoD_Array_Intro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows ");
        int rows = s.nextInt();
        System.out.println("enter columns");
        int cols = s.nextInt();
        int arr2[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("enter element at " + i + "th row and " + j + "th column");
                arr2[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
