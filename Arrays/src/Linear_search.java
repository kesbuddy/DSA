import java.util.Scanner;

public class Linear_search {
    public static int printIndexofGivenElement(int input[]) {
        int temp=0;
        System.out.println("enter element to be search :");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i = 0; i < input.length; i++) {
            if (x == input[i]) {
                temp = i;
                break;
            }
        }
        if (temp == 0) {
            return -1;
        } else {
            return temp;
        }
    }

    public static int[] takeinput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int arr[]=takeinput();
        System.out.println("the index of the given number in the given array is " + printIndexofGivenElement(arr));
    }
}
