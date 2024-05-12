import java.util.Scanner;

public class Count_Negative_Numbers {
    public static int countNegatives(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;
        for(int i=0; i<rows; i++) {
            for(int j = cols-1; j>=0; j--) {
                if (matrix[i][j] < 0)
                    count++;
                else
                    break;
            }
        }

        return count;
    }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println(countNegatives(mat));
    }
}
