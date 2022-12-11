import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class push_zeroes_to_end {
    public static int[] zeroesAtEnd(int [] input){
        return input;
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
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of times to run this program ");
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int [] arr = takeinput();
        }
    }
}
