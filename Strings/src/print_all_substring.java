import java.util.Scanner;

public class print_all_substring {
    public static void Substring(String str){
        for(int i=0;i<=str.length();i++){
            for(int j=0;j<=str.length();j++){
                if(j>i){
                    System.out.println(str.substring(i,j));
                }
            }
        }
    }
    public static String takeInput(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str;
    }

    public static void main(String[] args) {
        String str = takeInput();
        Substring(str);
    }

}
