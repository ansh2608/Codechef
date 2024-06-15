import java.util.Scanner;

public class Strong_Elements {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int find(int prefix[],int suffix[],int i,int n){
        if(i==0) return suffix[1];
        if(i==n-1) return prefix[n-2];
        else return gcd(prefix[i-1],suffix[i+1]);
    }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc =new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int count=0;
            int prefix[]=new int[n];
            int suffix[]=new int[n];
            prefix[0]=a[0];
            suffix[n-1]=a[n-1];
            for(int i=1;i<n;i++){
                prefix[i]=gcd(prefix[i-1],a[i]);
            }
            for(int i=n-2;i>=0;i--){
                suffix[i]=gcd(suffix[i+1],a[i]);
            }
            for(int i=0;i<n;i++){
                if(find(prefix,suffix,i,n)>1) count++;
            }
            System.out.println(count);
        }
    }
}
