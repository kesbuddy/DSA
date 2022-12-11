import java.util.Scanner;

public class count_words_in_string {
    public static void countWords(String str){
        int sum=1;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
    public static String takeInput(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str;
    }
    public static void main(String[] args) {
        String str =takeInput();
        countWords(str);
    }
}
