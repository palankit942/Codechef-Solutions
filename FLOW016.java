/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long gcd (long a, long b) {
    if (b == 0)
        return a;
    else
        return gcd (b, a % b);
    }
    
	public static void main (String[] args) 
	{
		// your code goes here
	  Scanner sc = new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
      long a = sc.nextInt();
      long b = sc.nextInt();
      long e=gcd(a,b);
      long d = (a*b)/e;
      System.out.println(e+" "+d);
      }
	}
}
