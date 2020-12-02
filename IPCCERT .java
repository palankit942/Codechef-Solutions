/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        long m=sc.nextLong();
        int k=sc.nextInt();
        int a=0;
        while(T-->0)
        {
            int t[]=new int[k];
            int count=0;
            for(int i=0;i<k;i++)
            {
                t[i]=sc.nextInt();
                count+=t[i];
            }
            long q=sc.nextLong();
            if(count>=m && q<=10)
            {
                a++;
            }
        }
        System.out.println(a);
	}
}
