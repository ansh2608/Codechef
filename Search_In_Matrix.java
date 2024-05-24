import java.util.Scanner;

public class Search_In_Matrix {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int st=0;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) arr[i][j]=sc.nextInt();
        int end=m*n-1;
        boolean z=false;
        while(st<=end){
            int mid=(st+end)/2;
            int x=mid/n;
            int y=mid%n;
            if(arr[x][y]==k){
                z=true;
                break;
            }
            else if(arr[x][y]<k) st=mid+1;
            else end=mid-1;
        }
        if(z) System.out.println("YES");
        else System.out.println("NO");
    }
}
