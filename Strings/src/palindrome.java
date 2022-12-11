import java.util.Scanner;

public class palindrome {
    public static void Palindrome(String str){
        int flag=0;
        int size = str.length();
        for(int i=0;i<=size/2;i++){
            if(str.charAt(i)==str.charAt((size-1)-i)){
                flag=1;
            }else{
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("it is a palindrome");
        }
        else if(flag==0){
            System.out.println("not palindrome");
        }
    }

    public static String takeInput(){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        return str;
    }

    public static void main(String[] args) {
        String str = takeInput();
        Palindrome(str);
    }
}
