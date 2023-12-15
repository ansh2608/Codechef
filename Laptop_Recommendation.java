import java.util.*;
public class Laptop_Recommendation {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++) {
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[11];
            int c=0;
            for(int j=0; j<n; j++) {
                a[j]=sc.nextInt();
                b[a[j]]++;
            }
            int max=b[1],k=0;
            for(int j=1; j<11; j++) max=Math.max(max,b[j]);
            for(int j=1; j<11; j++) {
                if(b[j]==max) {
                    k=j;
                    c++;
                }
            }
            if(c!=1) System.out.println("confused");
            else System.out.println(k);
        }
    }
}
