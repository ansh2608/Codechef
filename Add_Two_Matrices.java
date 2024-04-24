import java.util.Scanner;

public class Add_Two_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[][] a = new int[n][m],b = new int[n][m];
        for (int i1 = 0; i1 < n; i1++) for (int j1 = 0; j1 < m; j1++) a[i1][j1] = sc.nextInt();
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) b[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) System.out.print(a[i][j] + b[i][j] + " ");
            System.out.println();
        }
    }
}
