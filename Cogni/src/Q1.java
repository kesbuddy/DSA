import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = {3,3,3,3};
		int n = arr.length;
		int flag = 0;
		int count = 0;
		for(int i = 0; i <n-1; i++) {
			if((arr[i]+arr[i+1])%2==0) {
				count+=1;
				flag = 1;
			}
		}
		if(flag==1) {
			System.out.println(count);
		}
		else {
			System.out.println("-1");
		}
	}

}
