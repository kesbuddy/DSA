package recursion;

public class say_digit{
public static void words1(String arr[],int n) {
	//base case
	if(n==0) {
		return;
	}
	// relation
	int digit = n%10;
	n=n/10;
	
	words1(arr,n); // if we would have printed first than called it would have printed from backward.
	System.out.print(arr[digit]+ " "); // now it will print from last to top .. means first print 4 than 1 than two
}
	
	
	
	public static void main(String[] args) {
		String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int n=412;
		words1(arr,n);
	}

}
