import java.util.Scanner;

public class Donation_Rewards {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner num=new Scanner(System.in);
        int n= num.nextInt();
        while(n-->0) {
            int m=num.nextInt();
            if (m>6) System.out.println("gold");
            else if(m<=3) System.out.println("bronze");
            else System.out.println("silver");
        }
    }
}
