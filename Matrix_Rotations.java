import java.util.Scanner;

public class Matrix_Rotations {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int[][] a=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<r;j++){
            for(int i=r-1;i>=0;i--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
