import java.util.Scanner;

public class check_permutations {
    public static void Permutation(String str1,String str2){
        int flag=0;
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        flag=1;
                        break;
                    }else{
                        flag=0;
                    }
                }
                if(flag==0){
                    break;
                }
            }
        }else{
            System.out.println("false");
        }
        if(flag==0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }

    public static String takeInput1() {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        return str1;
    }
    public static String takeInput2() {
        Scanner s = new Scanner(System.in);
        String str2 = s.nextLine();
        return str2;
    }

    public static void main(String[] args) {
        String s = takeInput1();
        String s1 = takeInput2();
        Permutation(s,s1);
    }
}
