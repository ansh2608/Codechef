import java.util.Scanner;

public class Control_the_Pollution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int ans=(x)>(y*25)?(n/100)*25*y:(n/100)*x;
            n=n%100;
            ans=ans+((int)Math.ceil(n/4.0)*y>x?x:((int)Math.ceil(n/4.0))*y);
            System.out.println(ans);
        }
    }
}
