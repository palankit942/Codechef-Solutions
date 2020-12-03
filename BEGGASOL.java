/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int n = sc.nextInt();
	        int j,arr[] = new int[n];
	        for(j=0;j<n;j++)
	        {
	            arr[j] = sc.nextInt();
	        }
	        int gas=arr[0];
	        int ans=arr[0];
	        for(j=1;j<n;j++)
	        {
	            gas--;
	            if(gas < 0)
	            break;
	            gas += arr[j];
	            ans += arr[j];
	        }
	        System.out.println(ans);
	    }
	}
}
