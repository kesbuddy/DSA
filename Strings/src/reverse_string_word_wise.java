import java.util.Scanner;

public class reverse_string_word_wise {
    public static void Reverse(String str){
        int size = str.length();
        int m=0;
        int k=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)!=' ')&&(str.charAt(i+1)==' ')){
                if(m==0){
                  for(int j=i;j>=0;j--){
                      System.out.print(str.charAt(j));
                  }
                  k=i+1;
                  m++;
                }
                else{
                    for(int x=i;x>=k;x--){
                        System.out.print(str.charAt(x));
                    }
                }
            }
        }
    }

    public static String takeInput() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str;
    }

    public static void main(String[] args) {
        String s = takeInput();
        Reverse(s);
    }
}
