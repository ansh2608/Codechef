import java.util.Scanner;

public class Maximum_Area_Island {
    public static int areaOfIsland(int[][] mat, int i, int j, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m && mat[i][j] == 1) {
            mat[i][j] = 0;
            return 1 + areaOfIsland(mat, i + 1, j, n, m) + areaOfIsland(mat, i - 1, j, n, m)
                    + areaOfIsland(mat, i, j - 1, n, m) + areaOfIsland(mat, i, j + 1, n, m);
        }
        return 0;
    }

    public static int maxAreaOfIsland(int[][] mat, int n, int m) {
        int max_area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    max_area = Math.max(max_area, areaOfIsland(mat, i, j, n, m));
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxAreaOfIsland(mat, n, m));
    }
}
