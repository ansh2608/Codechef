import java.util.Scanner;

public class Chef_and_Water_Bottles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            if (x>k) System.out.println(0);
            else if (n*x<=k) System.out.println(n);
            else System.out.println(k/x);
        }
    }
}
