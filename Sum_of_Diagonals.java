import java.util.Scanner;

public class Sum_of_Diagonals {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) a[i][j]=sc.nextInt();
        int s=0;
        for(int i=0;i<n;i++){
            if(i!=n-i-1) s+=a[i][i]+a[i][n-i-1];
            else s+=a[i][i];
        }
        System.out.println(s);
    }
}
