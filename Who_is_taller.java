import java.util.Scanner;

public class Who_is_taller {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X<Y) System.out.println("B");
            else System.out.println("A");
        }
    }
}
