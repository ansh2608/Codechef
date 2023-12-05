import java.util.Scanner;

public class Too_many_items {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        for(int i=0;i<t;i++) {
            int n= scan.nextInt();
            int a =n/10;
            if(n%10==0) System.out.println(a);
            else System.out.println(a+1);
        }
    }
}
