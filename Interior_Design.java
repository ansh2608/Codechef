import java.util.Scanner;

public class Interior_Design {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int d=s.nextInt();
            if((a+b)<(c+d)) System.out.println(a+b);
            else System.out.println(c+d);
        }
    }
}
