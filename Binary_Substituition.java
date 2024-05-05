import java.util.Scanner;

public class Binary_Substituition {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            String s = in.next();
            int l = s.length();
            if (l == 1) System.out.println("1");
            else {
                int[] dp = new int[l];
                dp[0] = 1;
                if (s.charAt(0) != s.charAt(1)) dp[1] = 2;
                else dp[1] = 1;
                for (int i = 2; i < l; i++) {
                    dp[i] = dp[i - 1];
                    if (s.charAt(i) != s.charAt(i - 1)) dp[i] = (dp[i] + dp[i - 2]) % 998244353;
                }
                System.out.println(dp[l - 1]);
            }
        }
    }
}
