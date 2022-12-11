package recursion;

public class removeX {
	
	public static String removeXX(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans = "";
		if(str.charAt(0)!='x') {
			ans = ans + str.charAt(0);
		}
		String smallAnswer = removeXX(str.substring(1));
		return ans + smallAnswer;
	}

	public static void main(String[] args) {
		String str = "xaabxdx";
		System.out.println(removeXX(str));

	}

}
