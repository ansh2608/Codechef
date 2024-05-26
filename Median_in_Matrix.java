import java.util.*;
public class Median_in_Matrix {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        int[] b=new int[n*m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                b[k]=a[i][j];
                k++;
            }
        }
        Arrays.sort(b);
        System.out.println(b[(n*m)/2]);
    }
}
