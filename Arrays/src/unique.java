public class unique{

    public static int findUnique(int[] arr){
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        sum+=1;
                        break;
                    }
                }
            }
            if(sum==0){
                ans=arr[i];
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,3,5};
        int num = findUnique(arr);
        System.out.println(num);
    }
}
