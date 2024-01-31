import java.util.Scanner;

public class Finding_Square_Roots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            double n=sc.nextInt();
            double ans=Math.sqrt(n);
            System.out.println((int)ans);
        }
    }
}
