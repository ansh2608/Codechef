import java.util.Scanner;

public class Subscriptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int ans=(n+5)/6;
            System.out.println(ans*x);
        }
    }
}
