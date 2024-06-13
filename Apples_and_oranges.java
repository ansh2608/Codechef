import java.util.Scanner;

public class Apples_and_oranges {
    public static int gcd (int a , int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int n = s.nextInt();
            int m = s.nextInt();
            int val = gcd(n,m);
            System.out.println(val);
            t--;
        }
    }
}
