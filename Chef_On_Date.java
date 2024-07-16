import java.util.Scanner;

public class Chef_On_Date {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            if(a>=b) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
