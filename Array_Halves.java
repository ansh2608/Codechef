import java.util.Scanner;

public class Array_Halves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            long[] p=new long[2*n];
            long j=0,count=0;
            for (int i=0;i<2*n;i++) {
                p[i]=sc.nextLong();
                if (p[i]>n){
                    count+=n-i+j;
                    j++;
                }
            }
            System.out.println(count);
        }
    }
}
