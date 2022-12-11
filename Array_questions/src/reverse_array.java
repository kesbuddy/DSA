// LEETCODE - - >  Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.


import java.util.ArrayList;

public class reverse_array 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int s = m+1;
        int temp=0;
        int e = arr.size()-1;
        while(s<=e){
            temp = arr.get(s);
            arr.set(s,arr.get(e));
            arr.set(e,temp);
            s++;
            e--;
        }
    }
}