import java.util.Scanner;

public class Minimum_Coins {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            System.out.println(x%10);
        }
    }
}
