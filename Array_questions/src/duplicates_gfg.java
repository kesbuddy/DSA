
public class duplicates_gfg {
	
	public static int dupli(int A[]) {
		
	int temp = 0;
      for(int i=0;i<A.length-1;i++){
          if(A[i]==A[i+1]){
              temp = A[i];
              break;
          }
      }
      return temp;
  }
	public static void main(String[] args) {
		int arr[] = {2,3,4,4,4,4,4,5,6,7,9};
		System.out.println(dupli(arr));

	}

}
