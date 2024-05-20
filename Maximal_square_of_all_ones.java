import java.util.Scanner;

public class Maximal_square_of_all_ones {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) matrix[i][j] = sc.nextInt();
        }
        int maxSqSize = maximal(matrix);
        int maxArea = maxSqSize * maxSqSize;
        System.out.println(maxArea);
    }
    private static int maximal(int[][] matrix){
        int maxSqSize = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            dp[i][0] = matrix[i][0];
            maxSqSize = Math.max(maxSqSize, dp[i][0]);
        }
        for (int j = 0; j < cols; j++) {
            dp[0][j] = matrix[0][j];
            maxSqSize = Math.max(maxSqSize, dp[0][j]);
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    maxSqSize = Math.max(maxSqSize, dp[i][j]);
                }
            }
        }
        return maxSqSize;
    }
}
