/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
		int numOfTC = Integer.parseInt(myInput.readLine());
		while(numOfTC > 0){
		    int num = Integer.parseInt(myInput.readLine());
		    if(num > 0 && num < 10){
		        System.out.println(num);
		    }else{
		        int newNum = -1;
		        while(num>0){
		           int digit = num%10;
		           num = num/10;
		           newNum = (newNum != -1)?((newNum*10) + digit):digit;
		        }
		        System.out.println(newNum);
		    }
		    numOfTC = numOfTC-1;
		}
	}
}
