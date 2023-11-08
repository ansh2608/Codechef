import java.util.Scanner;

public class Maximum_Length_Even_Subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int ans=(n*(n+1))/2;
            if (ans%2==0) System.out.println(n);
            else System.out.println(n-1);
        }
    }
}
