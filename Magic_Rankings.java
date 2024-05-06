import java.util.*;
public class Magic_Rankings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] ar = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    ar[i][j] = sc.nextInt();
            int[][] dp = new int[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) dp[i][j] = Integer.MIN_VALUE;
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if (i == (n - 1) && j == (n - 1)) {
                        dp[i][j] = 0;
                        continue;
                    }
                    dp[i][j] = Math.max((dp[i][j + 1]), (dp[i + 1][j])) + ar[i][j];
                }
            }
            System.out.println(dp[0][0] >= 0 ? (dp[0][0] / (double) (2 * n - 3)) : "Bad Judges");
        }
    }
}
