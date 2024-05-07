import java.util.Scanner;

public class SUPW {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=in.nextInt();
        }
        int dp[]=new int[n];
        int min=0;
        if(n<=2){
            if(n==1)
                System.out.println(a[0]);
            else
                System.out.println(Math.min(a[0],a[1]));
        }
        else {
            for(int i=0;i<n;i++) {
                if(i<3) {
                    dp[i]=a[i];
                }
                else {
                    min=Math.min(dp[i-3],Math.min(dp[i-2],dp[i-1]));
                    dp[i]=a[i]+min;
                }
            }
            System.out.println(Math.min(dp[n-3],Math.min(dp[n-2],dp[n-1])));
        }
        // your code goes here
    }
}
