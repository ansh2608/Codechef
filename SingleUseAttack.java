import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();
            for (int i=0;i<T ;i++ ) {
                int H = sc.nextInt();
                int X = sc.nextInt();
                int Y = sc.nextInt();
            
         if(H-Y<=0)
         System.out.println("1");
		  else
		  {
		   int specialattackcombo= (int)(Math.ceil((double)(H-Y)/X))+1;
		   System.out.println(specialattackcombo);
		 
            }
	        
	    } 
    }
}
