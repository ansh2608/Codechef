import java.util.Scanner;

public class Sheokand_and_Number {
    public static long log2(long n){
        return (long)(Math.log(n)/Math.log(2));
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long x = log2(n);
            x = (long)Math.pow(2,x);
            long y =x*2;
            long ran=(x+y)/2;
            long ban = (ran+y)/2;
            if(n==1) System.out.println(2);
            else if(n>ban) System.out.println(y+1-n);
            else{
                ran = n-x;
                y = log2(ran);
                y = (long)Math.pow(2,y);
                ban = y*2;
                y=ban-ran<ran-y?ban:y;
                System.out.println(ran==0?1:ran>y?ran-y:y-ran);
            }
        }
    }
}
