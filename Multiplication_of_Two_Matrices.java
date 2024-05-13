import java.util.Scanner;

public class Multiplication_of_Two_Matrices {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[][] b=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int[][] c=new int[n][m1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m1;j++){
                c[i][j]=0;
                for(int k=0;k<n1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
