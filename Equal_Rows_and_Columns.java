import java.util.Arrays;
import java.util.Scanner;

public class Equal_Rows_and_Columns {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

        // Input matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Count of pairs
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Arrays.equals(matrix[i], matrix[j])) {
                    count++;
                    break; // Exit the inner loop once a match is found
                }
            }
        }

        System.out.println(count);

    }
}
