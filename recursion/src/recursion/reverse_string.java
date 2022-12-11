package recursion;

public class reverse_string {
	public static String reverse(String str) {
		if(str.length()==1){
			return str;
		}
		String ans = reverse(str.substring(1));
		return ans;
	}

	public static void main(String[] args) {
		String str = "abcde";
		System.out.println(reverse(str));
	}

}
