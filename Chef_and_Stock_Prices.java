import java.util.Scanner;

public class Chef_and_Stock_Prices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int s=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            s =s*(c+100)/100;
            if (s>=a && s<=b) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
