import java.util.Scanner;

public class binary__search {
    public static int BinarySearch(int []arr,int elem){
        int start=0;
        int end=arr.length-1;
        while(start<=end){  // start index is always less than or equal to end,if start becomes greater,than basically the elements have crossed over and not found
            int mid=(start+end)/2;
            if(elem==arr[mid]){
                return mid;
            }
            else if(elem>arr[mid]){
                start=mid+1;
            }
            else if(elem<arr[mid]){
                end=end-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={6,10,15,32,35,40,45,60};
        Scanner s=new Scanner(System.in);
        int elem=s.nextInt();
        int index= BinarySearch(arr,elem);
        System.out.println(index);
    }

}
