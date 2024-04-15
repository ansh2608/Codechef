import java.util.Scanner;

public class Dominant_Element {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        while(T-->0) {
            int n=s.nextInt();
            int[] a=new int[n];
            int[] f1=new int[1001];
            for(int i=0;i<n;i++) a[i]=s.nextInt();
            for(int i=0;i<n;i++) f1[a[i]]++;
            java.util.Arrays.sort(f1);
            if(f1[1000]!=f1[999]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
