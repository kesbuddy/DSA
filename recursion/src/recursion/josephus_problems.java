package recursion;

public class josephus_problems {
	public static int joseph(int n,int k) {
		if(n==1) {
			return 0;
		}
		int ans = ((joseph(n-1,k)+k)%n);
		return ans;
	}

	
	public static void main(String[] args) {
		System.out.println(joseph(7,3));

	}

}
