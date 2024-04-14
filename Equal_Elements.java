import java.util.Scanner;

public class Equal_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0) {
            int n=sc.nextInt();
            int[] ar=new int[n+1];
            for(int i=0;i<n;i++) {
                int b=sc.nextInt();
                ar[b]++;
            }
            int sum=0;
            for(int i=0;i<n+1;i++) if(ar[i]>sum) sum=ar[i];
            System.out.println(n-sum);
        }
    }
}