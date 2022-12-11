/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		int i = 0;
	    Scanner s = new Scanner(System.in);
	    int x = s.nextInt();
	    int count = 0;
	    int rem = 0;
	    while(i<x){
	        int num = s.nextInt();
	        while(num!=0){
	            rem = num%10;
	            if(rem == 4){
	                count++;
	            }
	            num/=10;
	        }
	        System.out.println(count);
	        i++;
	}
}
}
