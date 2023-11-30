
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int l=1;l<=t;l++)
		{
		    int count=0;
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        if(a[i]>=10&&a[i]<=60)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}