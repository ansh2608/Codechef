import java.util.*;

public class Weird_Palindrome_Making {
    final static int mod = 1000000007;
    public static int fpow(int a, int n, int mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 != 0) res = (res * (long) a) % mod;
            n = n >> 1;
            a = (int) (((long) a * a) % mod);
        }
        return (int) res;
    }

    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a&b);
    }
    public static boolean[] prime(int n){
        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=arr[1]=false;
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true) for(int j=i*2;j<n;j=j+1) arr[j]=false;
        }
        return arr;
    }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int e=0,o=0,s=0,ans=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s+=a[i];
                if(a[i]%2==0)e++;
                else o++;
            }
            if(s%2!=0) ans=(o-1)/2;
            else{
                if(n==o)ans=o/2;
                else ans=o/2;
            }
            System.out.println(ans);
        }
    }
}
