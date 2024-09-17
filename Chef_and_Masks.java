import java.util.Scanner;

public class Chef_and_Masks {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=100*a;
            int d=10*b;
            if(c==d) System.out.println("Cloth");
            else if(c>d) System.out.println("Cloth");
            else System.out.println("Disposable");
        }
    }
}
