import java.util.Scanner;

public class Paper_Cutting {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int k=sc.nextInt();
            int n=sc.nextInt();
            System.out.println((k/n)*(k/n));
        }
    }
}
