import java.util.Scanner;

public class Six_Friends {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=3*a;
            int d=2*b;
            if(c>d)
                System.out.println(d);
            else
                System.out.println(c);
            n--;
        }
        // your code goes here
    }
}
