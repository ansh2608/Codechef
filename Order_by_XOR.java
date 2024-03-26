import java.util.Scanner;

public class Order_by_XOR {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int ans=0;
            for(int i=29;i>=0;i--) {
                int val=(1<<i);
                int d=a^val;
                int e=b^val;
                int f=c^val;
                if(d<e && e<f) {
                    a=d;
                    b=e;
                    c=f;
                    ans=ans^val;
                    break;
                }
                else {
                    if(d<Math.min(e,f) || f>Math.max(d,e)) {
                        a=d;
                        b=e;
                        c=f;
                        ans=ans^val;
                    }
                }
            }
            if(a<b && b<c) System.out.println(ans);
            else System.out.println(-1);
        }
    }
}
