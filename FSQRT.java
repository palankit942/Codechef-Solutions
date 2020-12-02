/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a;
		for(int i=0;i<n;i++)
		{
		    long num=sc.nextLong();
		    a=(long)Math.sqrt(num);
		    System.out.println(a);
		}
	}
}
