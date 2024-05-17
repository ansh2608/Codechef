import java.util.Scanner;

public class Row_With_Maximum_Ones {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int[] count = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    count[i]++;
                }
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < row; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex+1);
    }
}
