import java.util.Scanner;

public class Chef_and_Spells {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if (a<=b && a<=c) System.out.println(b+c);
            else if (b<=a && b<=c) System.out.println(a+c);
            else if (c<=a && c<=b) System.out.println(a+b);
        }
    }
}
