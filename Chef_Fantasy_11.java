import java.util.Scanner;

public class Chef_Fantasy_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int ans=n*(n-1);
            System.out.println(ans);
        }
    }
}
