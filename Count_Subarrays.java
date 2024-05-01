import java.util.*;

public class Count_Subarrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int n=in.nextInt();
            int[] arr=new int[n];
            int[] dp=new int[n];
            Arrays.fill(dp,1);
            for(int i=0;i<n;i++) arr[i]=in.nextInt();
            for(int i=0;i<n-1;i++) if(arr[i]<=arr[i+1]) dp[i+1]+=dp[i];
            long s=0;
            for(int i=0;i<n;i++) s+=dp[i];
            System.out.println(s);
        }
    }
}
