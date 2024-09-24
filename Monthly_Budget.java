import java.util.Scanner;

public class Monthly_Budget {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0){
            int a=s.nextInt();
            int b=s.nextInt();
            if(30*b<=a) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
