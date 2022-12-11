package recursion;

public class power {
	public static int power1(int n,int m) {
		if(m==1) {
			return n;
		}
		return n* power1(n,m-1);
	}

	public static void main(String[] args) {
		System.out.println(power1(3,5));
		
	}

}
