import java.util.Scanner;

public class Alternating_subarray_prefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++) a[i]=in.nextInt();
            int[] b = new int[n];
            b[n-1] = 1;
            for(int i=n-2; i>=0; i--){
                int sign = Integer.signum(a[i])+Integer.signum(a[i+1]);
                if(sign==0) b[i] = b[i+1]+1;
                else b[i] = 1;
            }
            for(int i=0; i<n; i++) System.out.print(b[i]+" ");
            System.out.println();
        }
    }
}
