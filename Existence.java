import java.util.Scanner;

public class Existence {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long x =sc.nextLong();
            long y=sc.nextLong();
            long l= (x*x*x*x)+4*(y*y);
            long r= (4*(x*x)*y);
            if(l==r){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
