import java.util.Scanner;

public class Presents_for_Cheffina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int fac=1;
            for (int i=1;i<=n;i++) fac*=i;
            System.out.println(fac);
        }
    }
}
